package icoder.resources;


import icoder.config.Config;
import icoder.config.IConfig;
import icoder.models.Service;

import javax.inject.Inject;
import javax.mail.Folder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * StatusResource controller
 *
 * @since 1.0
 */
@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {

  @Inject
  @IConfig
  Config config;




  @GET
  public Service status() {

    boolean a = this.checkIsNameDuplicateInParent(null);
    System.out.println("TEST");

    Service service = new Service();
    service.setMessage("Service is up and running");
    service.setName(config.toString("applicationName"));
    service.setVersion(config.toString("version") + ":" + config.toString("environment"));
    return service;
  }

  /**
   * Check if the folder name is duplicate in the parent folder - it's case insensitive
   *
   * @param folder
   * @return true/false - duplicate/unique
   */
  public Boolean checkIsNameDuplicateInParent(Folder folder) {
    List<Folder> mediaFoldersByCountry = new ArrayList<>();
    for (Folder mediaFolderByCountry : mediaFoldersByCountry) {
      if (mediaFolderByCountry.getName().equalsIgnoreCase(folder.getName())) {
        if (mediaFolderByCountry.getName().equals(folder.getName()))
          continue;
        else {
          if (mediaFolderByCountry.getFullName() == null && folder.getFullName() == null) {
            return true;
          } else {
            if (mediaFolderByCountry.getFullName() == null || folder.getFullName() == null) {
              continue;
            }
            if (mediaFolderByCountry.getFullName().equals(folder.getFullName())) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }

    public Boolean checkIs1NameDuplicateInParent(Folder folder) {
        List<Folder> mediaFoldersByCountry = new ArrayList<>();
        for (Folder mediaFolderByCountry : mediaFoldersByCountry) {
            if (mediaFolderByCountry.getName().equalsIgnoreCase(folder.getName())) {
                if (mediaFolderByCountry.getName().equals(folder.getName()))
                    continue;
                else {
                    if (mediaFolderByCountry.getFullName() == null && folder.getFullName() == null) {
                        return true;
                    } else {
                        if (mediaFolderByCountry.getFullName() == null || folder.getFullName() == null) {
                            continue;
                        }
                        if (mediaFolderByCountry.getFullName().equals(folder.getFullName())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public Boolean checkIsNameDuplicateInPare3nt(Folder folder) {
        List<Folder> mediaFoldersByCountry = new ArrayList<>();
        for (Folder mediaFolderByCountry : mediaFoldersByCountry) {
            if (mediaFolderByCountry.getName().equalsIgnoreCase(folder.getName())) {
                if (mediaFolderByCountry.getName().equals(folder.getName()))
                    continue;
                else {
                    if (mediaFolderByCountry.getFullName() == null && folder.getFullName() == null) {
                        return true;
                    } else {
                        if (mediaFolderByCountry.getFullName() == null || folder.getFullName() == null) {
                            continue;
                        }
                        if (mediaFolderByCountry.getFullName().equals(folder.getFullName())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public Boolean checkIsNameDuplicateInParent2(Folder folder) {
        List<Folder> mediaFoldersByCountry = new ArrayList<>();
        for (Folder mediaFolderByCountry : mediaFoldersByCountry) {
            if (mediaFolderByCountry.getName().equalsIgnoreCase(folder.getName())) {
                if (mediaFolderByCountry.getName().equals(folder.getName()))
                    continue;
                else {
                    if (mediaFolderByCountry.getFullName() == null && folder.getFullName() == null) {
                        return true;
                    } else {
                        if (mediaFolderByCountry.getFullName() == null || folder.getFullName() == null) {
                            continue;
                        }
                        if (mediaFolderByCountry.getFullName().equals(folder.getFullName())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}
