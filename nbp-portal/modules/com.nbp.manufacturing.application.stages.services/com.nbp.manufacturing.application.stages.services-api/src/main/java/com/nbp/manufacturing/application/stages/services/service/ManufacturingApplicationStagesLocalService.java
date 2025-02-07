/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

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

import com.nbp.manufacturing.application.stages.services.exception.NoSuchManufacturingApplicationStagesException;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for ManufacturingApplicationStages. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationStagesLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ManufacturingApplicationStagesLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.manufacturing.application.stages.services.service.impl.ManufacturingApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the manufacturing application stages local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link ManufacturingApplicationStagesLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the manufacturing application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 * @return the manufacturing application stages that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ManufacturingApplicationStages addManufacturingApplicationStages(
		ManufacturingApplicationStages manufacturingApplicationStages);

	/**
	 * Creates a new manufacturing application stages with the primary key. Does not add the manufacturing application stages to the database.
	 *
	 * @param manufacturingAppStagesId the primary key for the new manufacturing application stages
	 * @return the new manufacturing application stages
	 */
	@Transactional(enabled = false)
	public ManufacturingApplicationStages createManufacturingApplicationStages(
		long manufacturingAppStagesId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the manufacturing application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages that was removed
	 * @throws PortalException if a manufacturing application stages with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public ManufacturingApplicationStages deleteManufacturingApplicationStages(
			long manufacturingAppStagesId)
		throws PortalException;

	/**
	 * Deletes the manufacturing application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 * @return the manufacturing application stages that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public ManufacturingApplicationStages deleteManufacturingApplicationStages(
		ManufacturingApplicationStages manufacturingApplicationStages);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesModelImpl</code>.
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
	public ManufacturingApplicationStages fetchManufacturingApplicationStages(
		long manufacturingAppStagesId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public String getManufacturingApplicaitonCurrentStages(String caseId);

	/**
	 * Returns the manufacturing application stages with the primary key.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages
	 * @throws PortalException if a manufacturing application stages with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ManufacturingApplicationStages getManufacturingApplicationStages(
			long manufacturingAppStagesId)
		throws PortalException;

	/**
	 * Returns a range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of manufacturing application stageses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ManufacturingApplicationStages>
		getManufacturingApplicationStageses(int start, int end);

	/**
	 * Returns the number of manufacturing application stageses.
	 *
	 * @return the number of manufacturing application stageses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getManufacturingApplicationStagesesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ManufacturingApplicationStages> getManufacturingByCI(
			String caseId)
		throws NoSuchManufacturingApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ManufacturingApplicationStages getManufacturingByCI_SN(
			String caseId, String stageName)
		throws NoSuchManufacturingApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ManufacturingApplicationStages getManufacturingByCI_ST(
			String caseId, String stageStatus)
		throws NoSuchManufacturingApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ManufacturingApplicationStages getManufacturingByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws NoSuchManufacturingApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ManufacturingApplicationStages getManufacturingByMAI(
			long manufacturingApplicationId)
		throws NoSuchManufacturingApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ManufacturingApplicationStages> getManufacturingBySN_Status(
			String stageName, String status)
		throws NoSuchManufacturingApplicationStagesException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getManufacturingDistinctStages();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Long getManufacturingSeenCases();

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

	public List<ManufacturingApplicationStages>
		gtManufacturingApplicationStages_By_SN(String stageName);

	/**
	 * Updates the manufacturing application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 * @return the manufacturing application stages that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ManufacturingApplicationStages updateManufacturingApplicationStages(
		ManufacturingApplicationStages manufacturingApplicationStages);

	public ManufacturingApplicationStages updateManufacturingApplicationStages(
		String caseId, String stageName, Date stageStartDate, Date stageEndDate,
		String duration, String stageStatus);

}