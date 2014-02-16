<html>
    <head>
    	<link rel="stylesheet" href="${resource(dir:'/css',file:'gna.css')}" />
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
