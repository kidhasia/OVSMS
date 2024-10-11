function togglePassword(id) {
    const passwordInput = document.getElementById(id);
    const type = passwordInput.getAttribute('type') === 'password' ? 'text' : 'password';
    passwordInput.setAttribute('type', type);
}

function validatePasswords() {
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;
    if (password !== confirmPassword) {
        alert('Passwords do not match');
        return false;
    }
    return true;
}

document.getElementById('registrationForm').addEventListener('submit', function(event) {
    if (!validatePasswords()) {
        event.preventDefault();
    }
});
