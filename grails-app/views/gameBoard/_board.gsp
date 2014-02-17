<g:each var="tower" in="${towers}" status="towerIndex">
	<div id="${towerIndex}" class="tower" ondrop="drop(event)" ondragover="allowDrop(event)">	
		<ul>
			<g:each var="ring" in="${tower.rings}" status="ringIndex">
				<li id="${ring.id}" class="ring ring${ring.id}" draggable="true" ondragstart="drag(event)"></li>
			</g:each>
		</ul>
	</div>
</g:each>
