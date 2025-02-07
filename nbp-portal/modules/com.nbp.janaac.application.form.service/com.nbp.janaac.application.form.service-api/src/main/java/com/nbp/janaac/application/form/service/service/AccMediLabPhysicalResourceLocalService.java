/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

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

import com.nbp.janaac.application.form.service.exception.NoSuchAccMediLabPhysicalResourceException;
import com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for AccMediLabPhysicalResource. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabPhysicalResourceLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface AccMediLabPhysicalResourceLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AccMediLabPhysicalResourceLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the acc medi lab physical resource local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link AccMediLabPhysicalResourceLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the acc medi lab physical resource to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabPhysicalResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabPhysicalResource the acc medi lab physical resource
	 * @return the acc medi lab physical resource that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AccMediLabPhysicalResource addAccMediLabPhysicalResource(
		AccMediLabPhysicalResource accMediLabPhysicalResource);

	/**
	 * Creates a new acc medi lab physical resource with the primary key. Does not add the acc medi lab physical resource to the database.
	 *
	 * @param accMediLabPhysicalResourceId the primary key for the new acc medi lab physical resource
	 * @return the new acc medi lab physical resource
	 */
	@Transactional(enabled = false)
	public AccMediLabPhysicalResource createAccMediLabPhysicalResource(
		long accMediLabPhysicalResourceId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the acc medi lab physical resource from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabPhysicalResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabPhysicalResource the acc medi lab physical resource
	 * @return the acc medi lab physical resource that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public AccMediLabPhysicalResource deleteAccMediLabPhysicalResource(
		AccMediLabPhysicalResource accMediLabPhysicalResource);

	/**
	 * Deletes the acc medi lab physical resource with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabPhysicalResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the acc medi lab physical resource
	 * @return the acc medi lab physical resource that was removed
	 * @throws PortalException if a acc medi lab physical resource with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public AccMediLabPhysicalResource deleteAccMediLabPhysicalResource(
			long accMediLabPhysicalResourceId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabPhysicalResourceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabPhysicalResourceModelImpl</code>.
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
	public AccMediLabPhysicalResource fetchAccMediLabPhysicalResource(
		long accMediLabPhysicalResourceId);

	/**
	 * Returns the acc medi lab physical resource matching the UUID and group.
	 *
	 * @param uuid the acc medi lab physical resource's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccMediLabPhysicalResource
		fetchAccMediLabPhysicalResourceByUuidAndGroupId(
			String uuid, long groupId);

	/**
	 * Returns the acc medi lab physical resource with the primary key.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the acc medi lab physical resource
	 * @return the acc medi lab physical resource
	 * @throws PortalException if a acc medi lab physical resource with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccMediLabPhysicalResource getAccMediLabPhysicalResource(
			long accMediLabPhysicalResourceId)
		throws PortalException;

	/**
	 * Returns the acc medi lab physical resource matching the UUID and group.
	 *
	 * @param uuid the acc medi lab physical resource's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab physical resource
	 * @throws PortalException if a matching acc medi lab physical resource could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccMediLabPhysicalResource
			getAccMediLabPhysicalResourceByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the acc medi lab physical resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @return the range of acc medi lab physical resources
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AccMediLabPhysicalResource> getAccMediLabPhysicalResources(
		int start, int end);

	/**
	 * Returns all the acc medi lab physical resources matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab physical resources
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab physical resources, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AccMediLabPhysicalResource>
		getAccMediLabPhysicalResourcesByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of acc medi lab physical resources matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab physical resources
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab physical resources, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AccMediLabPhysicalResource>
		getAccMediLabPhysicalResourcesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccMediLabPhysicalResource> orderByComparator);

	/**
	 * Returns the number of acc medi lab physical resources.
	 *
	 * @return the number of acc medi lab physical resources
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAccMediLabPhysicalResourcesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccMediLabPhysicalResource getJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabPhysicalResourceException;

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
	 * Updates the acc medi lab physical resource in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabPhysicalResourceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabPhysicalResource the acc medi lab physical resource
	 * @return the acc medi lab physical resource that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AccMediLabPhysicalResource updateAccMediLabPhysicalResource(
		AccMediLabPhysicalResource accMediLabPhysicalResource);

}