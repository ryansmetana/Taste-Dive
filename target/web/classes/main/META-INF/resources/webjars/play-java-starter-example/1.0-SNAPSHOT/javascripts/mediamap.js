var cy;
var mediaIdList = [];

document.addEventListener('DOMContentLoaded', function(){
    cy = window.cy = cytoscape({
        container: document.getElementById('cy'),

        autounselectify: true,

        boxSelectionEnabled: false,

        layout: {
            name: 'cola',
            nodeSpacing: 25
        },

        style: [
            {
                selector: 'node[type="music"]',
                style: {
                    "label": "data(label)",
                    "background-color": "green"
                }
            },

            {
                selector: 'node[type="movie"]',
                style: {
                    "label": "data(label)",
                    "background-color": "blue",
                    "shape": "star"
                }
            },

            {
                selector: 'node[type="book"]',
                style: {
                    "label": "data(label)",
                    "background-color": "orange",
                    "shape": "rectangle"
                }
            },

            {
                selector: 'node[type="show"]',
                style: {
                    "label": "data(label)",
                    "background-color": "yellow",
                    "shape": "round-rectangle"
                }
            },

            {
                selector: 'node[type="author"]',
                style: {
                    "label": "data(label)",
                    "background-color": "purple",
                    "shape": "diamond"
                }
            },

            {
                selector: 'node[type="game"]',
                style: {
                    "label": "data(label)",
                    "background-color": "red",
                    "shape": "triangle"
                }
            },

            {
                selector: 'node[type="podcast"]',
                style: {
                    "label": "data(label)",
                    "background-color": "white",
                    "border-color": "black",
                    "shape": "vee"
                }
            },

            {
                selector: 'edge',
                style: {
                    "line-color": "gray"
                }
            }

        ]

    });

    cy.on('click', 'node', function(evt) {
        getNodes(evt.target.id());
    });

    cy.on('cxttap', 'node', function(evt) {
        addToFavorites(evt.target.id());
    });

});

function getNodes(qString) {
    var requestUrl = "/users/default/search/".concat(encodeURIComponent(qString));
    $.ajax({
       url: requestUrl,
       type: 'GET',
       dataType: "html",
       success: function(res) {
           if (res) {
               addNodes(JSON.parse(res));
           } else {
               console.log("Failed");
           }
       }
    });
}

function addToFavorites(qString) {
    $.ajax({
       url: "/users/default/favorites",
       data: qString,
       headers: {
            'Content-Type': "text/plain"
       },
       type: 'POST',
       success: function(res) {
           if (res) {
               console.log("Added to favorites");
               document.getElementById("favoritesList").contentWindow.location.reload();
           } else {
               console.log("Did not add to favorites");
           }
       }
    });
}

function addNodes(json) {
    // Apply filters
    var filterList = [];
    if (document.getElementById('filterMusic').checked) {filterList.push("music");}
    if (document.getElementById('filterMovies').checked) {filterList.push("movie");}
    if (document.getElementById('filterShows').checked) {filterList.push("show");}
    if (document.getElementById('filterPodcasts').checked) {filterList.push("podcast");}
    if (document.getElementById('filterBooks').checked) {filterList.push("book");}
    if (document.getElementById('filterAuthors').checked) {filterList.push("author");}
    if (document.getElementById('filterGames').checked) {filterList.push("game");}

    // Add origin
    var originName = decodeURIComponent(json.Similar.Info[0].Name);
    var originType = decodeURIComponent(json.Similar.Info[0].Type);
    var originId = originType.concat(":", originName);
    if (!mediaIdList.includes(originId) && originType !== "unknown") {
        cy.add(
            {
                group: 'nodes',
                data: { id: originId, label: originName, type: originType }
            }
        );
        mediaIdList.push(originId);
    }

    // Add similar media
    for (var i=0; i<json.Similar.Results.length; i++) {
        var mediaName = decodeURIComponent(json.Similar.Results[i].Name);
        var mediaType = decodeURIComponent(json.Similar.Results[i].Type);
        var mediaId = mediaType.concat(":", mediaName);
        if (!filterList.includes(json.Similar.Results[i].Type) && originType !== "unknown") {
            if (!mediaIdList.includes(mediaId)) {
                cy.add(
                    {group: "nodes", data: {id: mediaId, label: mediaName, type: mediaType} }
                );
                mediaIdList.push(mediaId);
                console.log(mediaId);
            }
            cy.add(
                {group: "edges", data: {source: originId, target: mediaId} }
            );
        }
    };
    cy.layout({name: 'cola'}).run();

    // Update side window
    document.getElementById("mediaDisplayName").innerHTML = originName;
    document.getElementById("mediaDisplayType").innerHTML = originType;
    document.getElementById("mediaDisplayDescription").innerHTML = json.Similar.Info[0].wTeaser;
    document.getElementById("mediaDisplayWikiLink").innerHTML = "<a href="
            .concat(json.Similar.Info[0].wUrl)
            .concat(" target=\"_blank\">")
            .concat(json.Similar.Info[0].wUrl)
            .concat("</a>");
    document.getElementById("mediaDisplayVideo").innerHTML = "<a href="
             .concat(json.Similar.Info[0].yUrl)
             .concat(" target=\"_blank\">")
             .concat(json.Similar.Info[0].yUrl)
             .concat("</a>");
}