<div class="header-home header">
  <%--<%= image_tag "thats-my-rig-logo.png", :alt => "That's my rig", :class => "logo" %>
  --%>
  <img src = "${resource(dir:'images', file:'thats-my-rig-logo.png') }" class ='logo' alt = "That's my rig" />
  <ul class="right-block">
    <%--<% unless current_user %>
    --%>
    <li>
      <a href="" class="add-rig btn" data-toggle="modal" data-target="#signup-modal" role="button">Sign up</a>
    </li>
    <li class="login menu-trigger">
      <a class="add-rig btn">Log in</a>
      <%--<% unless current_user %>
      --%>
      <div class="login-form menu">
        <form>
        	<g:textField name="email" placeholder = 'Email'/>
        	<g:passwordField name="password" placeholder = 'Password'/>
        	<div class="remember-me">
        		<label for = "remember_me">Remember me</label>
	            <g:checkBox name = "remember_me" value = "true" />	            
	        </div>
	        <g:submitButton name="Log in" class = 'btn' />
        </form>
      </div>
    </li>
    <%--<% else %>
      <li>
        <a href="" class="add-rig btn" data-toggle="modal" data-target="#add-rig-modal" role="button">Add Rig</a>
      </li>
    <% end %>
    <% if current_user %>
    <li class="menu-trigger">
      <a class="user">
        <%= gravatar_image_tag( current_user.email, :alt => current_user.name, :height => 24 ) %>
      </a>
      <div class="menu">
        <ul>
          <li>
            <%=  current_user.name %>
          </li>
          <li>
            <%= link_to "Log out", logout_path %>
          </li>
        </ul>
        <div class="user-name"><%= current_user.name %></div>
      </div>
    </li>
    <% end %>
    --%>
  </ul>
</div>