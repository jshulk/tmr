<div id="signup-modal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">Sign up</h3>
  </div>
  <div class="modal-body">
    <form>
    
    
      
      <label for = "name">Name : </label>
      <g:textField name = 'name' />
      
      <label for = "email">Email : </label>
      <g:textField name = 'email' />

      <label for = "name">Password : </label>
      <g:passwordField name = 'password' />

      <label for = "password_confirm">Confirm Password : </label>
      <g:passwordField name = 'password_confirm' />

      <g:submitButton name = "Register" />

	</form>
    
  </div>
</div>

