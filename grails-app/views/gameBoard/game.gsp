<html>
    <head>
    	<link rel="stylesheet" href="${resource(dir:'/css',file:'gna.css')}" />
    	<g:javascript library="jquery" />
    	<g:javascript>
    	
    		var allowDrop = function(ev){ ev.preventDefault(); }
    		
    		var drag = function(ev){ev.dataTransfer.setData("ringId",ev.target.id);}
			
			var drop = function(ev){
				ev.preventDefault();
				var towerId = ev.target.id;
				var ringId = ev.dataTransfer.getData("ringId");
				
				<g:remoteFunction action="dropRing" update="board"
					params="{ringId:ringId, towerId:towerId}"/>
			}
        </g:javascript>
        <r:layoutResources />
    </head>
    <body>
        <h1>Welcome to Grails and Ale Towers of Hanoi</h1>
        <h2>Drag and drop disks to reposition</h2>
        <div id="board">
        <g:render template="board"/>
        </div>
        <r:layoutResources />
    </body>
</html>
