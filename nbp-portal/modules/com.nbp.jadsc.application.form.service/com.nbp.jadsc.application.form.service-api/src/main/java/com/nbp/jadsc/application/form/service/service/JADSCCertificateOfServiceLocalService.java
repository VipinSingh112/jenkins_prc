/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

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

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCCertificateOfServiceException;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for JADSCCertificateOfService. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface JADSCCertificateOfServiceLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.jadsc.application.form.service.service.impl.JADSCCertificateOfServiceLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the jadsc certificate of service local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link JADSCCertificateOfServiceLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the jadsc certificate of service to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfService the jadsc certificate of service
	 * @return the jadsc certificate of service that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public JADSCCertificateOfService addJADSCCertificateOfService(
		JADSCCertificateOfService jadscCertificateOfService);

	/**
	 * Creates a new jadsc certificate of service with the primary key. Does not add the jadsc certificate of service to the database.
	 *
	 * @param jadscCOSId the primary key for the new jadsc certificate of service
	 * @return the new jadsc certificate of service
	 */
	@Transactional(enabled = false)
	public JADSCCertificateOfService createJADSCCertificateOfService(
		long jadscCOSId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the jadsc certificate of service from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfService the jadsc certificate of service
	 * @return the jadsc certificate of service that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public JADSCCertificateOfService deleteJADSCCertificateOfService(
		JADSCCertificateOfService jadscCertificateOfService);

	/**
	 * Deletes the jadsc certificate of service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service that was removed
	 * @throws PortalException if a jadsc certificate of service with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public JADSCCertificateOfService deleteJADSCCertificateOfService(
			long jadscCOSId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceModelImpl</code>.
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
	public JADSCCertificateOfService fetchJADSCCertificateOfService(
		long jadscCOSId);

	/**
	 * Returns the jadsc certificate of service matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of service's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JADSCCertificateOfService
		fetchJADSCCertificateOfServiceByUuidAndGroupId(
			String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JADSCCertificateOfService getJADSCBy_Id(long jadscApplicationId)
		throws NoSuchJADSCCertificateOfServiceException;

	/**
	 * Returns the jadsc certificate of service with the primary key.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service
	 * @throws PortalException if a jadsc certificate of service with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JADSCCertificateOfService getJADSCCertificateOfService(
			long jadscCOSId)
		throws PortalException;

	/**
	 * Returns the jadsc certificate of service matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of service's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of service
	 * @throws PortalException if a matching jadsc certificate of service could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JADSCCertificateOfService
			getJADSCCertificateOfServiceByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the jadsc certificate of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @return the range of jadsc certificate of services
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JADSCCertificateOfService> getJADSCCertificateOfServices(
		int start, int end);

	/**
	 * Returns all the jadsc certificate of services matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of services
	 * @param companyId the primary key of the company
	 * @return the matching jadsc certificate of services, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JADSCCertificateOfService>
		getJADSCCertificateOfServicesByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of jadsc certificate of services matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of services
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc certificate of services, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JADSCCertificateOfService>
		getJADSCCertificateOfServicesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<JADSCCertificateOfService> orderByComparator);

	/**
	 * Returns the number of jadsc certificate of services.
	 *
	 * @return the number of jadsc certificate of services
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getJADSCCertificateOfServicesCount();

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
	 * Updates the jadsc certificate of service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfService the jadsc certificate of service
	 * @return the jadsc certificate of service that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public JADSCCertificateOfService updateJADSCCertificateOfService(
		JADSCCertificateOfService jadscCertificateOfService);

}