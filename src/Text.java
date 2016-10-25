import java.util.List;

import com.oracle.po.Role;
import com.oracle.po.TD0Organization;
import com.oracle.services.FindorganizationServices;
import com.oracle.services.RoleServices;
import com.oracle.services.UsersServices;
import com.oracle.services.impl.FindorganizationServicesImpl;
import com.oracle.services.impl.RoleServicesImpl;
import com.oracle.services.impl.UsersServicesImpl;
import com.oracle.util.ConfigManager;
import com.oracle.util.GetPath.GetString;
import com.oracle.util.mappingmanager.SelectManager;


public class Text {
	public static void main(String[] args) {
//		System.out.println(ConfigManager.DRIVERNAME);
//		System.out.println(ConfigManager.PASSWORD);
//		System.out.println(ConfigManager.SHOW_SQL);
//		System.out.println(ConfigManager.SIZE);
//		System.out.println(ConfigManager.URL);
//		System.out.println(ConfigManager.USERNAME);

//		<!-- <script type="text/javascript">
//	    var CurrentPage =${CurrentPage.get(0)};
//	    
//	    var totalpage = ${CurrentPage.get(1)};
//	    
//	    function submitForm(actionUrl){
//	     var formElement = document.getElementById("for");
//	     formElement.action = actionUrl;
//	     formElement.submit();
//	    }
//	    
//	    function nextPage(){
//	     if(CurrentPage == totalpage){
//	        alert("This is the last page");
//	        return false;
//	     }else{
//	       submitForm("<%=basePath %>page?currentPage"+(CurrentPage+1));
//	     }
//	    }
//
//	</script>  -->	
		
		
//		FindorganizationServices findorg = new FindorganizationServicesImpl();
//		List<TD0Organization> Organizationlist = findorg.selectOrganization();
//		for(TD0Organization org:Organizationlist){
//			System.out.println(org.getId()+","+org.getOrgname());
//		}
		RoleServices r = new RoleServicesImpl();
		List<Role> rs = r.selectRoleByUsersId(1);
		for(Role rss:rs){
			System.out.println(rss.getRoleId()+","+rss.getRoleName());
		}
	}

}
