/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireEvaluation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AcquireEvaluation. This utility wraps
 * <code>com.nbp.acquire.stages.service.service.impl.AcquireEvaluationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireEvaluationLocalService
 * @generated
 */
public class AcquireEvaluationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.acquire.stages.service.service.impl.AcquireEvaluationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acquire evaluation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireEvaluationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireEvaluation the acquire evaluation
	 * @return the acquire evaluation that was added
	 */
	public static AcquireEvaluation addAcquireEvaluation(
		AcquireEvaluation acquireEvaluation) {

		return getService().addAcquireEvaluation(acquireEvaluation);
	}

	/**
	 * Creates a new acquire evaluation with the primary key. Does not add the acquire evaluation to the database.
	 *
	 * @param acquireEvaluationId the primary key for the new acquire evaluation
	 * @return the new acquire evaluation
	 */
	public static AcquireEvaluation createAcquireEvaluation(
		long acquireEvaluationId) {

		return getService().createAcquireEvaluation(acquireEvaluationId);
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
	 * Deletes the acquire evaluation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireEvaluationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireEvaluation the acquire evaluation
	 * @return the acquire evaluation that was removed
	 */
	public static AcquireEvaluation deleteAcquireEvaluation(
		AcquireEvaluation acquireEvaluation) {

		return getService().deleteAcquireEvaluation(acquireEvaluation);
	}

	/**
	 * Deletes the acquire evaluation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireEvaluationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation that was removed
	 * @throws PortalException if a acquire evaluation with the primary key could not be found
	 */
	public static AcquireEvaluation deleteAcquireEvaluation(
			long acquireEvaluationId)
		throws PortalException {

		return getService().deleteAcquireEvaluation(acquireEvaluationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireEvaluationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireEvaluationModelImpl</code>.
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

	public static AcquireEvaluation fetchAcquireEvaluation(
		long acquireEvaluationId) {

		return getService().fetchAcquireEvaluation(acquireEvaluationId);
	}

	/**
	 * Returns the acquire evaluation with the primary key.
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation
	 * @throws PortalException if a acquire evaluation with the primary key could not be found
	 */
	public static AcquireEvaluation getAcquireEvaluation(
			long acquireEvaluationId)
		throws PortalException {

		return getService().getAcquireEvaluation(acquireEvaluationId);
	}

	public static AcquireEvaluation getAcquireEvaluationBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireEvaluationException {

		return getService().getAcquireEvaluationBy_CI(caseId);
	}

	/**
	 * Returns a range of all the acquire evaluations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireEvaluationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire evaluations
	 * @param end the upper bound of the range of acquire evaluations (not inclusive)
	 * @return the range of acquire evaluations
	 */
	public static List<AcquireEvaluation> getAcquireEvaluations(
		int start, int end) {

		return getService().getAcquireEvaluations(start, end);
	}

	/**
	 * Returns the number of acquire evaluations.
	 *
	 * @return the number of acquire evaluations
	 */
	public static int getAcquireEvaluationsCount() {
		return getService().getAcquireEvaluationsCount();
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

	public static AcquireEvaluation updateAcquireApplicationEvaluation(
		String caseId, String typeOfCommittee,
		java.util.Date dateOfCommitteeDecision, String committeeDecision) {

		return getService().updateAcquireApplicationEvaluation(
			caseId, typeOfCommittee, dateOfCommitteeDecision,
			committeeDecision);
	}

	/**
	 * Updates the acquire evaluation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireEvaluationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireEvaluation the acquire evaluation
	 * @return the acquire evaluation that was updated
	 */
	public static AcquireEvaluation updateAcquireEvaluation(
		AcquireEvaluation acquireEvaluation) {

		return getService().updateAcquireEvaluation(acquireEvaluation);
	}

	public static AcquireEvaluationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcquireEvaluationLocalService>
		_serviceSnapshot = new Snapshot<>(
			AcquireEvaluationLocalServiceUtil.class,
			AcquireEvaluationLocalService.class);

}