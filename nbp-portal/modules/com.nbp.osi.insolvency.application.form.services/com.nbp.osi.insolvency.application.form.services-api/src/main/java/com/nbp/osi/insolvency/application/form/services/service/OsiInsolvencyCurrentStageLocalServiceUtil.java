/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiInsolvencyCurrentStage. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiInsolvencyCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyCurrentStageLocalService
 * @generated
 */
public class OsiInsolvencyCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiInsolvencyCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi insolvency current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyCurrentStage the osi insolvency current stage
	 * @return the osi insolvency current stage that was added
	 */
	public static OsiInsolvencyCurrentStage addOsiInsolvencyCurrentStage(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		return getService().addOsiInsolvencyCurrentStage(
			osiInsolvencyCurrentStage);
	}

	/**
	 * Creates a new osi insolvency current stage with the primary key. Does not add the osi insolvency current stage to the database.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key for the new osi insolvency current stage
	 * @return the new osi insolvency current stage
	 */
	public static OsiInsolvencyCurrentStage createOsiInsolvencyCurrentStage(
		long osiInsolvencyCurrentStageId) {

		return getService().createOsiInsolvencyCurrentStage(
			osiInsolvencyCurrentStageId);
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
	 * Deletes the osi insolvency current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage that was removed
	 * @throws PortalException if a osi insolvency current stage with the primary key could not be found
	 */
	public static OsiInsolvencyCurrentStage deleteOsiInsolvencyCurrentStage(
			long osiInsolvencyCurrentStageId)
		throws PortalException {

		return getService().deleteOsiInsolvencyCurrentStage(
			osiInsolvencyCurrentStageId);
	}

	/**
	 * Deletes the osi insolvency current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyCurrentStage the osi insolvency current stage
	 * @return the osi insolvency current stage that was removed
	 */
	public static OsiInsolvencyCurrentStage deleteOsiInsolvencyCurrentStage(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		return getService().deleteOsiInsolvencyCurrentStage(
			osiInsolvencyCurrentStage);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyCurrentStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyCurrentStageModelImpl</code>.
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

	public static OsiInsolvencyCurrentStage fetchOsiInsolvencyCurrentStage(
		long osiInsolvencyCurrentStageId) {

		return getService().fetchOsiInsolvencyCurrentStage(
			osiInsolvencyCurrentStageId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static OsiInsolvencyCurrentStage getOI_Stage_OII(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyCurrentStageException {

		return getService().getOI_Stage_OII(osiInsolvencyId);
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
	 * Returns the osi insolvency current stage with the primary key.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage
	 * @throws PortalException if a osi insolvency current stage with the primary key could not be found
	 */
	public static OsiInsolvencyCurrentStage getOsiInsolvencyCurrentStage(
			long osiInsolvencyCurrentStageId)
		throws PortalException {

		return getService().getOsiInsolvencyCurrentStage(
			osiInsolvencyCurrentStageId);
	}

	/**
	 * Returns a range of all the osi insolvency current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency current stages
	 * @param end the upper bound of the range of osi insolvency current stages (not inclusive)
	 * @return the range of osi insolvency current stages
	 */
	public static List<OsiInsolvencyCurrentStage> getOsiInsolvencyCurrentStages(
		int start, int end) {

		return getService().getOsiInsolvencyCurrentStages(start, end);
	}

	/**
	 * Returns the number of osi insolvency current stages.
	 *
	 * @return the number of osi insolvency current stages
	 */
	public static int getOsiInsolvencyCurrentStagesCount() {
		return getService().getOsiInsolvencyCurrentStagesCount();
	}

	public static OsiInsolvencyCurrentStage getOsiInsolvenyById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyCurrentStageException {

		return getService().getOsiInsolvenyById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi insolvency current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyCurrentStage the osi insolvency current stage
	 * @return the osi insolvency current stage that was updated
	 */
	public static OsiInsolvencyCurrentStage updateOsiInsolvencyCurrentStage(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		return getService().updateOsiInsolvencyCurrentStage(
			osiInsolvencyCurrentStage);
	}

	public static OsiInsolvencyCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiInsolvencyCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiInsolvencyCurrentStageLocalServiceUtil.class,
			OsiInsolvencyCurrentStageLocalService.class);

}