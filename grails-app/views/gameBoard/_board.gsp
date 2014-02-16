<g:each var="tower" in="${towers}" status="towerIndex">
	<div class="tower">	
		<ul>
			<g:each var="ring" in="${tower.rings}" status="ringIndex">
				<li class="ring ring${ring.id}" draggable="true"></li>
			</g:each>
		</ul>
	</div>
</g:each>
