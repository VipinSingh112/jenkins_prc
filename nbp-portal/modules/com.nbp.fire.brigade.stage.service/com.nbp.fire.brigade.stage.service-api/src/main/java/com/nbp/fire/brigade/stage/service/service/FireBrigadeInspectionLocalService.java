/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
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

import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadeInspectionException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for FireBrigadeInspection. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeInspectionLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface FireBrigadeInspectionLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.fire.brigade.stage.service.service.impl.FireBrigadeInspectionLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the fire brigade inspection local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link FireBrigadeInspectionLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the fire brigade inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeInspection the fire brigade inspection
	 * @return the fire brigade inspection that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FireBrigadeInspection addFireBrigadeInspection(
		FireBrigadeInspection fireBrigadeInspection);

	/**
	 * Creates a new fire brigade inspection with the primary key. Does not add the fire brigade inspection to the database.
	 *
	 * @param fireBrigadeInspectionId the primary key for the new fire brigade inspection
	 * @return the new fire brigade inspection
	 */
	@Transactional(enabled = false)
	public FireBrigadeInspection createFireBrigadeInspection(
		long fireBrigadeInspectionId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the fire brigade inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeInspection the fire brigade inspection
	 * @return the fire brigade inspection that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public FireBrigadeInspection deleteFireBrigadeInspection(
		FireBrigadeInspection fireBrigadeInspection);

	/**
	 * Deletes the fire brigade inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection that was removed
	 * @throws PortalException if a fire brigade inspection with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public FireBrigadeInspection deleteFireBrigadeInspection(
			long fireBrigadeInspectionId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeInspectionModelImpl</code>.
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
	public FireBrigadeInspection fetchFireBrigadeInspection(
		long fireBrigadeInspectionId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FireBrigadeInspection> getFBI_CaseId(String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FireBrigadeInspection> getFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FireBrigadeInspection> getFBI_CaseIdStatus(
		String caseId, String status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FireBrigadeInspection> getFBI_FBAI(
		long fireBrigadeApplicationId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FireBrigadeInspection> getFBI_Status(String status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FireBrigadeInspection> getFBI_StatusApplicationId(
		String status, long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade inspection with the primary key.
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection
	 * @throws PortalException if a fire brigade inspection with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FireBrigadeInspection getFireBrigadeInspection(
			long fireBrigadeInspectionId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FireBrigadeInspection getFireBrigadeInspectionBy_CI(String caseId)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns a range of all the fire brigade inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of fire brigade inspections
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FireBrigadeInspection> getFireBrigadeInspections(
		int start, int end);

	/**
	 * Returns the number of fire brigade inspections.
	 *
	 * @return the number of fire brigade inspections
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFireBrigadeInspectionsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FireBrigadeInspection
			getInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeInspectionException;

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
	 * Updates the fire brigade inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeInspection the fire brigade inspection
	 * @return the fire brigade inspection that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public FireBrigadeInspection updateFireBrigadeInspection(
		FireBrigadeInspection fireBrigadeInspection);

}