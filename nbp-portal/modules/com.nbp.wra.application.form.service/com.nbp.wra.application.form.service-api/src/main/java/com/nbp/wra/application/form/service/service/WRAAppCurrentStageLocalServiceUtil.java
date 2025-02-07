/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.WRAAppCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for WRAAppCurrentStage. This utility wraps
 * <code>com.nbp.wra.application.form.service.service.impl.WRAAppCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppCurrentStageLocalService
 * @generated
 */
public class WRAAppCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.wra.application.form.service.service.impl.WRAAppCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the wra app current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppCurrentStage the wra app current stage
	 * @return the wra app current stage that was added
	 */
	public static WRAAppCurrentStage addWRAAppCurrentStage(
		WRAAppCurrentStage wraAppCurrentStage) {

		return getService().addWRAAppCurrentStage(wraAppCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new wra app current stage with the primary key. Does not add the wra app current stage to the database.
	 *
	 * @param wraAppCurrentStageId the primary key for the new wra app current stage
	 * @return the new wra app current stage
	 */
	public static WRAAppCurrentStage createWRAAppCurrentStage(
		long wraAppCurrentStageId) {

		return getService().createWRAAppCurrentStage(wraAppCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the wra app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage that was removed
	 * @throws PortalException if a wra app current stage with the primary key could not be found
	 */
	public static WRAAppCurrentStage deleteWRAAppCurrentStage(
			long wraAppCurrentStageId)
		throws PortalException {

		return getService().deleteWRAAppCurrentStage(wraAppCurrentStageId);
	}

	/**
	 * Deletes the wra app current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppCurrentStage the wra app current stage
	 * @return the wra app current stage that was removed
	 */
	public static WRAAppCurrentStage deleteWRAAppCurrentStage(
		WRAAppCurrentStage wraAppCurrentStage) {

		return getService().deleteWRAAppCurrentStage(wraAppCurrentStage);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static WRAAppCurrentStage fetchWRAAppCurrentStage(
		long wraAppCurrentStageId) {

		return getService().fetchWRAAppCurrentStage(wraAppCurrentStageId);
	}

	/**
	 * Returns the wra app current stage matching the UUID and group.
	 *
	 * @param uuid the wra app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage fetchWRAAppCurrentStageByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchWRAAppCurrentStageByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static WRAAppCurrentStage getByWRA_Stage(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getService().getByWRA_Stage(wraApplicationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the wra app current stage with the primary key.
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage
	 * @throws PortalException if a wra app current stage with the primary key could not be found
	 */
	public static WRAAppCurrentStage getWRAAppCurrentStage(
			long wraAppCurrentStageId)
		throws PortalException {

		return getService().getWRAAppCurrentStage(wraAppCurrentStageId);
	}

	/**
	 * Returns the wra app current stage matching the UUID and group.
	 *
	 * @param uuid the wra app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching wra app current stage
	 * @throws PortalException if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage getWRAAppCurrentStageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getWRAAppCurrentStageByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the wra app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @return the range of wra app current stages
	 */
	public static List<WRAAppCurrentStage> getWRAAppCurrentStages(
		int start, int end) {

		return getService().getWRAAppCurrentStages(start, end);
	}

	/**
	 * Returns all the wra app current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the wra app current stages
	 * @param companyId the primary key of the company
	 * @return the matching wra app current stages, or an empty list if no matches were found
	 */
	public static List<WRAAppCurrentStage>
		getWRAAppCurrentStagesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getWRAAppCurrentStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of wra app current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the wra app current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching wra app current stages, or an empty list if no matches were found
	 */
	public static List<WRAAppCurrentStage>
		getWRAAppCurrentStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return getService().getWRAAppCurrentStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of wra app current stages.
	 *
	 * @return the number of wra app current stages
	 */
	public static int getWRAAppCurrentStagesCount() {
		return getService().getWRAAppCurrentStagesCount();
	}

	/**
	 * Updates the wra app current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraAppCurrentStage the wra app current stage
	 * @return the wra app current stage that was updated
	 */
	public static WRAAppCurrentStage updateWRAAppCurrentStage(
		WRAAppCurrentStage wraAppCurrentStage) {

		return getService().updateWRAAppCurrentStage(wraAppCurrentStage);
	}

	public static WRAAppCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<WRAAppCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			WRAAppCurrentStageLocalServiceUtil.class,
			WRAAppCurrentStageLocalService.class);

}