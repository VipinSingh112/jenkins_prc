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

import com.nbp.janaac.application.form.service.exception.NoSuchAccMediLabTestDescriptionException;
import com.nbp.janaac.application.form.service.model.AccMediLabTestDescription;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for AccMediLabTestDescription. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestDescriptionLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface AccMediLabTestDescriptionLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AccMediLabTestDescriptionLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the acc medi lab test description local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link AccMediLabTestDescriptionLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the acc medi lab test description to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestDescriptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestDescription the acc medi lab test description
	 * @return the acc medi lab test description that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AccMediLabTestDescription addAccMediLabTestDescription(
		AccMediLabTestDescription accMediLabTestDescription);

	/**
	 * Creates a new acc medi lab test description with the primary key. Does not add the acc medi lab test description to the database.
	 *
	 * @param accMediLabTestDescriptionId the primary key for the new acc medi lab test description
	 * @return the new acc medi lab test description
	 */
	@Transactional(enabled = false)
	public AccMediLabTestDescription createAccMediLabTestDescription(
		long accMediLabTestDescriptionId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the acc medi lab test description from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestDescriptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestDescription the acc medi lab test description
	 * @return the acc medi lab test description that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public AccMediLabTestDescription deleteAccMediLabTestDescription(
		AccMediLabTestDescription accMediLabTestDescription);

	/**
	 * Deletes the acc medi lab test description with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestDescriptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestDescriptionId the primary key of the acc medi lab test description
	 * @return the acc medi lab test description that was removed
	 * @throws PortalException if a acc medi lab test description with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public AccMediLabTestDescription deleteAccMediLabTestDescription(
			long accMediLabTestDescriptionId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestDescriptionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestDescriptionModelImpl</code>.
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
	public AccMediLabTestDescription fetchAccMediLabTestDescription(
		long accMediLabTestDescriptionId);

	/**
	 * Returns the acc medi lab test description matching the UUID and group.
	 *
	 * @param uuid the acc medi lab test description's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab test description, or <code>null</code> if a matching acc medi lab test description could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccMediLabTestDescription
		fetchAccMediLabTestDescriptionByUuidAndGroupId(
			String uuid, long groupId);

	/**
	 * Returns the acc medi lab test description with the primary key.
	 *
	 * @param accMediLabTestDescriptionId the primary key of the acc medi lab test description
	 * @return the acc medi lab test description
	 * @throws PortalException if a acc medi lab test description with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccMediLabTestDescription getAccMediLabTestDescription(
			long accMediLabTestDescriptionId)
		throws PortalException;

	/**
	 * Returns the acc medi lab test description matching the UUID and group.
	 *
	 * @param uuid the acc medi lab test description's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab test description
	 * @throws PortalException if a matching acc medi lab test description could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccMediLabTestDescription
			getAccMediLabTestDescriptionByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the acc medi lab test descriptions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestDescriptionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @return the range of acc medi lab test descriptions
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AccMediLabTestDescription> getAccMediLabTestDescriptions(
		int start, int end);

	/**
	 * Returns all the acc medi lab test descriptions matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab test descriptions
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab test descriptions, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AccMediLabTestDescription>
		getAccMediLabTestDescriptionsByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of acc medi lab test descriptions matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab test descriptions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab test descriptions, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AccMediLabTestDescription>
		getAccMediLabTestDescriptionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccMediLabTestDescription> orderByComparator);

	/**
	 * Returns the number of acc medi lab test descriptions.
	 *
	 * @return the number of acc medi lab test descriptions
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAccMediLabTestDescriptionsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccMediLabTestDescription getJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccMediLabTestDescriptionException;

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
	 * Updates the acc medi lab test description in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestDescriptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestDescription the acc medi lab test description
	 * @return the acc medi lab test description that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AccMediLabTestDescription updateAccMediLabTestDescription(
		AccMediLabTestDescription accMediLabTestDescription);

}