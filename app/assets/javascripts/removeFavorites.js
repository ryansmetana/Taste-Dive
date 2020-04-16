

function removeFavorite(qString) {
    $.ajax({
       url: "/users/default/favorites",
       data: qString,
       headers: {
            'Content-Type': "text/plain"
       },
       type: 'DELETE',
       success: function(res) {
           if (res) {
               console.log("Deleted from favorites");
               location.reload();
           } else {
               console.log("Did not remove from favorites");
           }
       }
    });
}