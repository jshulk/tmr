<div class="header">
  <%--<%= image_tag "thats-my-rig-logo.png", :alt => "That's my rig", :class => "logo" %>
  --%>
  <img src = "${resource(dir:'images', file:'thats-my-rig-logo.png') }" class ='logo' alt = "That's my rig" />
  <ul class="right-block">
    <%--<% unless current_user %>
    --%>
    <li>
      <a href="" class="add-rig btn" data-toggle="modal" data-target="#signup-modal" role="button">Add rig</a>
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