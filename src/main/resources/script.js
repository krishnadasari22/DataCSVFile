document.getElementById('upload-form').addEventListener('submit', function (e) {
    e.preventDefault();
    const formData = new FormData(this);

    fetch('/api/upload', {
        method: 'POST',
        body: formData
    })
    .then(response => response.text())
    .then(result => {
        console.log(result);
        // Handle the result of the file upload
    })
    .catch(error => {
        console.error('Error:', error);
        // Handle any errors that occur during the file upload
    });
});
