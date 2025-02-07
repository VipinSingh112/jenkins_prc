/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.application.form.service.model.ExplosivesCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ExplosivesCurrentStage. This utility wraps
 * <code>com.nbp.explosives.competency.application.form.service.service.impl.ExplosivesCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesCurrentStageLocalService
 * @generated
 */
public class ExplosivesCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.explosives.competency.application.form.service.service.impl.ExplosivesCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the explosives current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesCurrentStage the explosives current stage
	 * @return the explosives current stage that was added
	 */
	public static ExplosivesCurrentStage addExplosivesCurrentStage(
		ExplosivesCurrentStage explosivesCurrentStage) {

		return getService().addExplosivesCurrentStage(explosivesCurrentStage);
	}

	/**
	 * Creates a new explosives current stage with the primary key. Does not add the explosives current stage to the database.
	 *
	 * @param explosiveStageId the primary key for the new explosives current stage
	 * @return the new explosives current stage
	 */
	public static ExplosivesCurrentStage createExplosivesCurrentStage(
		long explosiveStageId) {

		return getService().createExplosivesCurrentStage(explosiveStageId);
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
	 * Deletes the explosives current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesCurrentStage the explosives current stage
	 * @return the explosives current stage that was removed
	 */
	public static ExplosivesCurrentStage deleteExplosivesCurrentStage(
		ExplosivesCurrentStage explosivesCurrentStage) {

		return getService().deleteExplosivesCurrentStage(
			explosivesCurrentStage);
	}

	/**
	 * Deletes the explosives current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage that was removed
	 * @throws PortalException if a explosives current stage with the primary key could not be found
	 */
	public static ExplosivesCurrentStage deleteExplosivesCurrentStage(
			long explosiveStageId)
		throws PortalException {

		return getService().deleteExplosivesCurrentStage(explosiveStageId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesCurrentStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesCurrentStageModelImpl</code>.
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

	public static ExplosivesCurrentStage fetchExplosivesCurrentStage(
		long explosiveStageId) {

		return getService().fetchExplosivesCurrentStage(explosiveStageId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static ExplosivesCurrentStage getByExplosive_Stage(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesCurrentStageException {

		return getService().getByExplosive_Stage(explosivesApplicationId);
	}

	/**
	 * Returns the explosives current stage with the primary key.
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage
	 * @throws PortalException if a explosives current stage with the primary key could not be found
	 */
	public static ExplosivesCurrentStage getExplosivesCurrentStage(
			long explosiveStageId)
		throws PortalException {

		return getService().getExplosivesCurrentStage(explosiveStageId);
	}

	/**
	 * Returns a range of all the explosives current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives current stages
	 * @param end the upper bound of the range of explosives current stages (not inclusive)
	 * @return the range of explosives current stages
	 */
	public static List<ExplosivesCurrentStage> getExplosivesCurrentStages(
		int start, int end) {

		return getService().getExplosivesCurrentStages(start, end);
	}

	/**
	 * Returns the number of explosives current stages.
	 *
	 * @return the number of explosives current stages
	 */
	public static int getExplosivesCurrentStagesCount() {
		return getService().getExplosivesCurrentStagesCount();
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
	 * Updates the explosives current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesCurrentStage the explosives current stage
	 * @return the explosives current stage that was updated
	 */
	public static ExplosivesCurrentStage updateExplosivesCurrentStage(
		ExplosivesCurrentStage explosivesCurrentStage) {

		return getService().updateExplosivesCurrentStage(
			explosivesCurrentStage);
	}

	public static ExplosivesCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ExplosivesCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			ExplosivesCurrentStageLocalServiceUtil.class,
			ExplosivesCurrentStageLocalService.class);

}