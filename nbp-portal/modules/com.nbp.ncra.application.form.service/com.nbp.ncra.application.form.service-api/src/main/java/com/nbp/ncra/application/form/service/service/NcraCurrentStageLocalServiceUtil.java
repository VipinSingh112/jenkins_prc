/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.application.form.service.model.NcraCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcraCurrentStage. This utility wraps
 * <code>com.nbp.ncra.application.form.service.service.impl.NcraCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcraCurrentStageLocalService
 * @generated
 */
public class NcraCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncra.application.form.service.service.impl.NcraCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncra current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraCurrentStage the ncra current stage
	 * @return the ncra current stage that was added
	 */
	public static NcraCurrentStage addNcraCurrentStage(
		NcraCurrentStage ncraCurrentStage) {

		return getService().addNcraCurrentStage(ncraCurrentStage);
	}

	/**
	 * Creates a new ncra current stage with the primary key. Does not add the ncra current stage to the database.
	 *
	 * @param ncraCurrentStageId the primary key for the new ncra current stage
	 * @return the new ncra current stage
	 */
	public static NcraCurrentStage createNcraCurrentStage(
		long ncraCurrentStageId) {

		return getService().createNcraCurrentStage(ncraCurrentStageId);
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
	 * Deletes the ncra current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage that was removed
	 * @throws PortalException if a ncra current stage with the primary key could not be found
	 */
	public static NcraCurrentStage deleteNcraCurrentStage(
			long ncraCurrentStageId)
		throws PortalException {

		return getService().deleteNcraCurrentStage(ncraCurrentStageId);
	}

	/**
	 * Deletes the ncra current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraCurrentStage the ncra current stage
	 * @return the ncra current stage that was removed
	 */
	public static NcraCurrentStage deleteNcraCurrentStage(
		NcraCurrentStage ncraCurrentStage) {

		return getService().deleteNcraCurrentStage(ncraCurrentStage);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraCurrentStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraCurrentStageModelImpl</code>.
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

	public static NcraCurrentStage fetchNcraCurrentStage(
		long ncraCurrentStageId) {

		return getService().fetchNcraCurrentStage(ncraCurrentStageId);
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

	public static List<NcraCurrentStage> getNCRA_CS_NAI(
		long ncraApplicationId) {

		return getService().getNCRA_CS_NAI(ncraApplicationId);
	}

	public static NcraCurrentStage getNcraCurrent_By_NCRA_Id(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraCurrentStageException {

		return getService().getNcraCurrent_By_NCRA_Id(ncraApplicationId);
	}

	/**
	 * Returns the ncra current stage with the primary key.
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage
	 * @throws PortalException if a ncra current stage with the primary key could not be found
	 */
	public static NcraCurrentStage getNcraCurrentStage(long ncraCurrentStageId)
		throws PortalException {

		return getService().getNcraCurrentStage(ncraCurrentStageId);
	}

	/**
	 * Returns a range of all the ncra current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @return the range of ncra current stages
	 */
	public static List<NcraCurrentStage> getNcraCurrentStages(
		int start, int end) {

		return getService().getNcraCurrentStages(start, end);
	}

	/**
	 * Returns the number of ncra current stages.
	 *
	 * @return the number of ncra current stages
	 */
	public static int getNcraCurrentStagesCount() {
		return getService().getNcraCurrentStagesCount();
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
	 * Updates the ncra current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraCurrentStage the ncra current stage
	 * @return the ncra current stage that was updated
	 */
	public static NcraCurrentStage updateNcraCurrentStage(
		NcraCurrentStage ncraCurrentStage) {

		return getService().updateNcraCurrentStage(ncraCurrentStage);
	}

	public static NcraCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcraCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcraCurrentStageLocalServiceUtil.class,
			NcraCurrentStageLocalService.class);

}