/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.exception.NoSuchJTBApplicationException;
import com.nbp.jtb.application.form.service.model.JTBApplication;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for JTBApplication. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see JTBApplicationLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface JTBApplicationLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.JTBApplicationLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the jtb application local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link JTBApplicationLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the jtb application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public JTBApplication addJTBApplication(JTBApplication jtbApplication);

	/**
	 * Creates a new jtb application with the primary key. Does not add the jtb application to the database.
	 *
	 * @param jtbApplicationId the primary key for the new jtb application
	 * @return the new jtb application
	 */
	@Transactional(enabled = false)
	public JTBApplication createJTBApplication(long jtbApplicationId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the jtb application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public JTBApplication deleteJTBApplication(JTBApplication jtbApplication);

	/**
	 * Deletes the jtb application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application that was removed
	 * @throws PortalException if a jtb application with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public JTBApplication deleteJTBApplication(long jtbApplicationId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JTBApplication fetchJTBApplication(long jtbApplicationId);

	/**
	 * Returns the jtb application matching the UUID and group.
	 *
	 * @param uuid the jtb application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JTBApplication fetchJTBApplicationByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JTBApplication getJTB_By_AppNum(String applicationNumber)
		throws NoSuchJTBApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JTBApplication> getJTB_By_AppType_Status(
			int status, String typeOfApplication)
		throws NoSuchJTBApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JTBApplication getJTB_By_RT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchJTBApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JTBApplication> getJTB_By_Status(int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JTBApplication getJTB_ByCaseId(String caseId)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the jtb application with the primary key.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application
	 * @throws PortalException if a jtb application with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JTBApplication getJTBApplication(long jtbApplicationId)
		throws PortalException;

	/**
	 * Returns the jtb application matching the UUID and group.
	 *
	 * @param uuid the jtb application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application
	 * @throws PortalException if a matching jtb application could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JTBApplication getJTBApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JTBApplication> getJTBApplicationList_By_S_UId(
		long userId, int status);

	/**
	 * Returns a range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of jtb applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JTBApplication> getJTBApplications(int start, int end);

	/**
	 * Returns all the jtb applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb applications
	 * @param companyId the primary key of the company
	 * @return the matching jtb applications, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JTBApplication> getJTBApplicationsByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of jtb applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jtb applications, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JTBApplication> getJTBApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator);

	/**
	 * Returns the number of jtb applications.
	 *
	 * @return the number of jtb applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getJTBApplicationsCount();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getTpdcoDistinctCategories();

	/**
	 * Updates the jtb application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public JTBApplication updateJTBApplication(JTBApplication jtbApplication);

}