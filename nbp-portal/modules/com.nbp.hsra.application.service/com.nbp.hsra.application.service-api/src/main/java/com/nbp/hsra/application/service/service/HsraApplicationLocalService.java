/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

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

import com.nbp.hsra.application.service.exception.NoSuchHsraApplicationException;
import com.nbp.hsra.application.service.model.HsraApplication;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for HsraApplication. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface HsraApplicationLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.HsraApplicationLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the hsra application local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link HsraApplicationLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the hsra application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplication the hsra application
	 * @return the hsra application that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public HsraApplication addHsraApplication(HsraApplication hsraApplication);

	/**
	 * Creates a new hsra application with the primary key. Does not add the hsra application to the database.
	 *
	 * @param hsraApplicationId the primary key for the new hsra application
	 * @return the new hsra application
	 */
	@Transactional(enabled = false)
	public HsraApplication createHsraApplication(long hsraApplicationId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the hsra application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplication the hsra application
	 * @return the hsra application that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public HsraApplication deleteHsraApplication(
		HsraApplication hsraApplication);

	/**
	 * Deletes the hsra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application that was removed
	 * @throws PortalException if a hsra application with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public HsraApplication deleteHsraApplication(long hsraApplicationId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationModelImpl</code>.
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
	public HsraApplication fetchHsraApplication(long hsraApplicationId);

	/**
	 * Returns the hsra application matching the UUID and group.
	 *
	 * @param uuid the hsra application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HsraApplication fetchHsraApplicationByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	/**
	 * Returns the hsra application with the primary key.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application
	 * @throws PortalException if a hsra application with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HsraApplication getHsraApplication(long hsraApplicationId)
		throws PortalException;

	/**
	 * Returns the hsra application matching the UUID and group.
	 *
	 * @param uuid the hsra application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching hsra application
	 * @throws PortalException if a matching hsra application could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HsraApplication getHsraApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of hsra applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<HsraApplication> getHsraApplications(int start, int end);

	/**
	 * Returns all the hsra applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the hsra applications
	 * @param companyId the primary key of the company
	 * @return the matching hsra applications, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<HsraApplication> getHsraApplicationsByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of hsra applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the hsra applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching hsra applications, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<HsraApplication> getHsraApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator);

	/**
	 * Returns the number of hsra applications.
	 *
	 * @return the number of hsra applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getHsraApplicationsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HsraApplication getHsraByAppNum(String applicationNumber)
		throws NoSuchHsraApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HsraApplication getHsraByCaseId(String caseId)
		throws NoSuchHsraApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HsraApplication getHsraByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchHsraApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<HsraApplication> getHsraByS_U(long userId, int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<HsraApplication> getHsraByStatus(int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getHsraDistinctCategory();

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
	 * Updates the hsra application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplication the hsra application
	 * @return the hsra application that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public HsraApplication updateHsraApplication(
		HsraApplication hsraApplication);

}