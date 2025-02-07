/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HealthCareCurrentStage. This utility wraps
 * <code>com.nbp.healthcare.application.form.service.service.impl.HealthCareCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareCurrentStageLocalService
 * @generated
 */
public class HealthCareCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.healthcare.application.form.service.service.impl.HealthCareCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the health care current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareCurrentStage the health care current stage
	 * @return the health care current stage that was added
	 */
	public static HealthCareCurrentStage addHealthCareCurrentStage(
		HealthCareCurrentStage healthCareCurrentStage) {

		return getService().addHealthCareCurrentStage(healthCareCurrentStage);
	}

	/**
	 * Creates a new health care current stage with the primary key. Does not add the health care current stage to the database.
	 *
	 * @param HealthCareCurrentStageId the primary key for the new health care current stage
	 * @return the new health care current stage
	 */
	public static HealthCareCurrentStage createHealthCareCurrentStage(
		long HealthCareCurrentStageId) {

		return getService().createHealthCareCurrentStage(
			HealthCareCurrentStageId);
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
	 * Deletes the health care current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareCurrentStage the health care current stage
	 * @return the health care current stage that was removed
	 */
	public static HealthCareCurrentStage deleteHealthCareCurrentStage(
		HealthCareCurrentStage healthCareCurrentStage) {

		return getService().deleteHealthCareCurrentStage(
			healthCareCurrentStage);
	}

	/**
	 * Deletes the health care current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage that was removed
	 * @throws PortalException if a health care current stage with the primary key could not be found
	 */
	public static HealthCareCurrentStage deleteHealthCareCurrentStage(
			long HealthCareCurrentStageId)
		throws PortalException {

		return getService().deleteHealthCareCurrentStage(
			HealthCareCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareCurrentStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareCurrentStageModelImpl</code>.
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

	public static HealthCareCurrentStage fetchHealthCareCurrentStage(
		long HealthCareCurrentStageId) {

		return getService().fetchHealthCareCurrentStage(
			HealthCareCurrentStageId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static HealthCareCurrentStage getC_SById(long healthCareId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareCurrentStageException {

		return getService().getC_SById(healthCareId);
	}

	/**
	 * Returns the health care current stage with the primary key.
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage
	 * @throws PortalException if a health care current stage with the primary key could not be found
	 */
	public static HealthCareCurrentStage getHealthCareCurrentStage(
			long HealthCareCurrentStageId)
		throws PortalException {

		return getService().getHealthCareCurrentStage(HealthCareCurrentStageId);
	}

	/**
	 * Returns a range of all the health care current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care current stages
	 * @param end the upper bound of the range of health care current stages (not inclusive)
	 * @return the range of health care current stages
	 */
	public static List<HealthCareCurrentStage> getHealthCareCurrentStages(
		int start, int end) {

		return getService().getHealthCareCurrentStages(start, end);
	}

	/**
	 * Returns the number of health care current stages.
	 *
	 * @return the number of health care current stages
	 */
	public static int getHealthCareCurrentStagesCount() {
		return getService().getHealthCareCurrentStagesCount();
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
	 * Updates the health care current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareCurrentStage the health care current stage
	 * @return the health care current stage that was updated
	 */
	public static HealthCareCurrentStage updateHealthCareCurrentStage(
		HealthCareCurrentStage healthCareCurrentStage) {

		return getService().updateHealthCareCurrentStage(
			healthCareCurrentStage);
	}

	public static HealthCareCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HealthCareCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			HealthCareCurrentStageLocalServiceUtil.class,
			HealthCareCurrentStageLocalService.class);

}