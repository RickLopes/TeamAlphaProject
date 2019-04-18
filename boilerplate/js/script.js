var API_URL_CUSTOMER = "http://localhost:8080/javabank5/api/customer";
var API_URL_CUSTOMER = "http://localhost:8080/javabank5/api/customer/";
var API_URL_CUSTOMER = "http://localhost:8080/javabank5/api/customer";

$('#exampleModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) // Button that triggered the modal
  var recipient = button.data('whatever') // Extract info from data-* attributes
  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
  var modal = $(this)
  modal.find('.modal-title').text('New message to ' + recipient)
  modal.find('.modal-body input').val(recipient)
})

// add an animal
function addAnimal() {
  $.ajax({
      url: API_URL,
      type: "POST",
      data: JSON.stringify({
          firstName: $("#first").val(),
          lastName: $("#last").val(),
          email: $("#email").val(),
          phone: $("#phone").val()
      }),
      async: true,
      contentType: "application/json",
      success: fetchCustomers,
      error: errorCallback
  });
};

var populateWithAnimals = function(json) {
  var animalsDiv = document.getElementById("animalContainer");

  json.forEach(function(element) {
    var htmlString =
      '<div class="col-md-4 mb-5">' +
      ' <div class="card h-100" id="card-'+ element.id +'>' +
      '   <img class="card-img-top" src="http://placehold.it/300x200" alt="">' +
      '   <div class="card-body">' +
      '     <h4 class="card-title">'+ element.name+'</h4>' +
      '     <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente esse necessitatibus neque sequi doloribus totam ut praesentium aut.</p>' +
      '   </div>' +
      '   <div class="card-footer">' +
'           <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">'+ element.name +'</button>' +
      '   </div>' +
      ' </div>' +
      '</div>';
    animalsDiv.appendTo(htmlString);
    });
}
