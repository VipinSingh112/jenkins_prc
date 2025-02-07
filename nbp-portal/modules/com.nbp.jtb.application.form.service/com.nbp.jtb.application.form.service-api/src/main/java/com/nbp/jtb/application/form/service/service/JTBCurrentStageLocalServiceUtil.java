/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JTBCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JTBCurrentStage. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.JTBCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JTBCurrentStageLocalService
 * @generated
 */
public class JTBCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.JTBCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jtb current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbCurrentStage the jtb current stage
	 * @return the jtb current stage that was added
	 */
	public static JTBCurrentStage addJTBCurrentStage(
		JTBCurrentStage jtbCurrentStage) {

		return getService().addJTBCurrentStage(jtbCurrentStage);
	}

	/**
	 * Creates a new jtb current stage with the primary key. Does not add the jtb current stage to the database.
	 *
	 * @param jTBCurrentStageId the primary key for the new jtb current stage
	 * @return the new jtb current stage
	 */
	public static JTBCurrentStage createJTBCurrentStage(
		long jTBCurrentStageId) {

		return getService().createJTBCurrentStage(jTBCurrentStageId);
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
	 * Deletes the jtb current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbCurrentStage the jtb current stage
	 * @return the jtb current stage that was removed
	 */
	public static JTBCurrentStage deleteJTBCurrentStage(
		JTBCurrentStage jtbCurrentStage) {

		return getService().deleteJTBCurrentStage(jtbCurrentStage);
	}

	/**
	 * Deletes the jtb current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage that was removed
	 * @throws PortalException if a jtb current stage with the primary key could not be found
	 */
	public static JTBCurrentStage deleteJTBCurrentStage(long jTBCurrentStageId)
		throws PortalException {

		return getService().deleteJTBCurrentStage(jTBCurrentStageId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBCurrentStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBCurrentStageModelImpl</code>.
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

	public static JTBCurrentStage fetchJTBCurrentStage(long jTBCurrentStageId) {
		return getService().fetchJTBCurrentStage(jTBCurrentStageId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static JTBCurrentStage getByJTB_Stage(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBCurrentStageException {

		return getService().getByJTB_Stage(jtbApplicationId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jtb current stage with the primary key.
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage
	 * @throws PortalException if a jtb current stage with the primary key could not be found
	 */
	public static JTBCurrentStage getJTBCurrentStage(long jTBCurrentStageId)
		throws PortalException {

		return getService().getJTBCurrentStage(jTBCurrentStageId);
	}

	/**
	 * Returns a range of all the jtb current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb current stages
	 * @param end the upper bound of the range of jtb current stages (not inclusive)
	 * @return the range of jtb current stages
	 */
	public static List<JTBCurrentStage> getJTBCurrentStages(
		int start, int end) {

		return getService().getJTBCurrentStages(start, end);
	}

	/**
	 * Returns the number of jtb current stages.
	 *
	 * @return the number of jtb current stages
	 */
	public static int getJTBCurrentStagesCount() {
		return getService().getJTBCurrentStagesCount();
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
	 * Updates the jtb current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbCurrentStage the jtb current stage
	 * @return the jtb current stage that was updated
	 */
	public static JTBCurrentStage updateJTBCurrentStage(
		JTBCurrentStage jtbCurrentStage) {

		return getService().updateJTBCurrentStage(jtbCurrentStage);
	}

	public static JTBCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JTBCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			JTBCurrentStageLocalServiceUtil.class,
			JTBCurrentStageLocalService.class);

}