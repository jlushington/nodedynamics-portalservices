package com.nodedynamics.portalservices.model.links;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.nodedynamics.portalservices.model.CoreModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
@Document(collection="UserPortalConnection")
public class UserPortalModel extends CoreModel{
	
	@Id
	private String id;
	
	private String companyID;
	private String userID;
	
	private Hash<M>
	

}
