/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.collaboration.services.service;

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

import com.nbp.cannabis.collaboration.services.model.CannabisCollobartion;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for CannabisCollobartion. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisCollobartionLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface CannabisCollobartionLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.cannabis.collaboration.services.service.impl.CannabisCollobartionLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the cannabis collobartion local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link CannabisCollobartionLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the cannabis collobartion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 * @return the cannabis collobartion that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public CannabisCollobartion addCannabisCollobartion(
		CannabisCollobartion cannabisCollobartion);

	/**
	 * Creates a new cannabis collobartion with the primary key. Does not add the cannabis collobartion to the database.
	 *
	 * @param cannabisCollaborationId the primary key for the new cannabis collobartion
	 * @return the new cannabis collobartion
	 */
	@Transactional(enabled = false)
	public CannabisCollobartion createCannabisCollobartion(
		long cannabisCollaborationId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the cannabis collobartion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 * @return the cannabis collobartion that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public CannabisCollobartion deleteCannabisCollobartion(
		CannabisCollobartion cannabisCollobartion);

	/**
	 * Deletes the cannabis collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion that was removed
	 * @throws PortalException if a cannabis collobartion with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public CannabisCollobartion deleteCannabisCollobartion(
			long cannabisCollaborationId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionModelImpl</code>.
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
	public CannabisCollobartion fetchCannabisCollobartion(
		long cannabisCollaborationId);

	/**
	 * Returns the cannabis collobartion matching the UUID and group.
	 *
	 * @param uuid the cannabis collobartion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisCollobartion fetchCannabisCollobartionByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the cannabis collobartion with the primary key.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion
	 * @throws PortalException if a cannabis collobartion with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisCollobartion getCannabisCollobartion(
			long cannabisCollaborationId)
		throws PortalException;

	/**
	 * Returns the cannabis collobartion matching the UUID and group.
	 *
	 * @param uuid the cannabis collobartion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis collobartion
	 * @throws PortalException if a matching cannabis collobartion could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisCollobartion getCannabisCollobartionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of cannabis collobartions
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisCollobartion> getCannabisCollobartions(
		int start, int end);

	/**
	 * Returns all the cannabis collobartions matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis collobartions
	 * @param companyId the primary key of the company
	 * @return the matching cannabis collobartions, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisCollobartion>
		getCannabisCollobartionsByUuidAndCompanyId(String uuid, long companyId);

	/**
	 * Returns a range of cannabis collobartions matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis collobartions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis collobartions, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisCollobartion>
		getCannabisCollobartionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisCollobartion> orderByComparator);

	/**
	 * Returns the number of cannabis collobartions.
	 *
	 * @return the number of cannabis collobartions
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCannabisCollobartionsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisCollobartion>
		getCollaborationStageCaseIdUserTypeArchived(
			String cannabisStage, String caseId, String userType, int archived);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisCollobartion> getCollobartionByCaseId(String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisCollobartion> getCollobartionCannabisStageCaseId(
		String cannabisStage, String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisCollobartion>
		getCollobartionCannabisStageCaseIdUsertype(
			String cannabisStage, String caseId, String userType);

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
	 * Updates the cannabis collobartion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisCollobartionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 * @return the cannabis collobartion that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public CannabisCollobartion updateCannabisCollobartion(
		CannabisCollobartion cannabisCollobartion);

}