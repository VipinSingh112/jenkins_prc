/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationsException;
import com.nbp.cannabis.application.form.services.model.CannabisApplications;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for CannabisApplications. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationsLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface CannabisApplicationsLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationsLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the cannabis applications local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link CannabisApplicationsLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the cannabis applications to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplications the cannabis applications
	 * @return the cannabis applications that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public CannabisApplications addCannabisApplications(
		CannabisApplications cannabisApplications);

	/**
	 * Creates a new cannabis applications with the primary key. Does not add the cannabis applications to the database.
	 *
	 * @param cannabisApplicationId the primary key for the new cannabis applications
	 * @return the new cannabis applications
	 */
	@Transactional(enabled = false)
	public CannabisApplications createCannabisApplications(
		long cannabisApplicationId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the cannabis applications from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplications the cannabis applications
	 * @return the cannabis applications that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public CannabisApplications deleteCannabisApplications(
		CannabisApplications cannabisApplications);

	/**
	 * Deletes the cannabis applications with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications that was removed
	 * @throws PortalException if a cannabis applications with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public CannabisApplications deleteCannabisApplications(
			long cannabisApplicationId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationsModelImpl</code>.
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
	public CannabisApplications fetchCannabisApplications(
		long cannabisApplicationId);

	/**
	 * Returns the cannabis applications matching the UUID and group.
	 *
	 * @param uuid the cannabis applications's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisApplications fetchCannabisApplicationsByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the cannabis applications with the primary key.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications
	 * @throws PortalException if a cannabis applications with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisApplications getCannabisApplications(
			long cannabisApplicationId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisApplications getCannabisApplicationsByAppNo(
			String applicationNumber)
		throws NoSuchCannabisApplicationsException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisApplications getCannabisApplicationsByCaseId(String caseId)
		throws NoSuchCannabisApplicationsException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplications> getCannabisApplicationsByLicenseCategory(
		int status, String licenseCategory);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCannabisApplicationsByLicenseCategoryCount(
		int status, String licenseCategory);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplications>
		getCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCannabisApplicationsByLicenseSubCategoryCount(
		int status, String licenseSubCategory);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplications> getCannabisApplicationsByRequestType(
		int status, String requestType);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCannabisApplicationsByRequestTypeCount(
		int status, String requestType);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisApplications getCannabisApplicationsByRT_ExpiredAppNo(
			String expiredLicenseAppNo, String requestType)
		throws NoSuchCannabisApplicationsException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplications> getCannabisApplicationsByS_U(
		long userId, int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplications> getCannabisApplicationsByStatus(
		int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplications> getCannabisApplicationsByUser(
		long userId);

	/**
	 * Returns the cannabis applications matching the UUID and group.
	 *
	 * @param uuid the cannabis applications's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis applications
	 * @throws PortalException if a matching cannabis applications could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisApplications getCannabisApplicationsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of cannabis applicationses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplications> getCannabisApplicationses(
		int start, int end);

	/**
	 * Returns all the cannabis applicationses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis applicationses
	 * @param companyId the primary key of the company
	 * @return the matching cannabis applicationses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplications>
		getCannabisApplicationsesByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of cannabis applicationses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis applicationses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis applicationses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplications>
		getCannabisApplicationsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator);

	/**
	 * Returns the number of cannabis applicationses.
	 *
	 * @return the number of cannabis applicationses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCannabisApplicationsesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getCannabisDistinctCategories();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

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

	/**
	 * Updates the cannabis applications in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplications the cannabis applications
	 * @return the cannabis applications that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public CannabisApplications updateCannabisApplications(
		CannabisApplications cannabisApplications);

}