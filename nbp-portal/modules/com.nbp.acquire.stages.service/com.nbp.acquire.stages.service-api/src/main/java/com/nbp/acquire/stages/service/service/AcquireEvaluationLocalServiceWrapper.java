/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireEvaluationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireEvaluationLocalService
 * @generated
 */
public class AcquireEvaluationLocalServiceWrapper
	implements AcquireEvaluationLocalService,
			   ServiceWrapper<AcquireEvaluationLocalService> {

	public AcquireEvaluationLocalServiceWrapper() {
		this(null);
	}

	public AcquireEvaluationLocalServiceWrapper(
		AcquireEvaluationLocalService acquireEvaluationLocalService) {

		_acquireEvaluationLocalService = acquireEvaluationLocalService;
	}

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
	@Override
	public com.nbp.acquire.stages.service.model.AcquireEvaluation
		addAcquireEvaluation(
			com.nbp.acquire.stages.service.model.AcquireEvaluation
				acquireEvaluation) {

		return _acquireEvaluationLocalService.addAcquireEvaluation(
			acquireEvaluation);
	}

	/**
	 * Creates a new acquire evaluation with the primary key. Does not add the acquire evaluation to the database.
	 *
	 * @param acquireEvaluationId the primary key for the new acquire evaluation
	 * @return the new acquire evaluation
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireEvaluation
		createAcquireEvaluation(long acquireEvaluationId) {

		return _acquireEvaluationLocalService.createAcquireEvaluation(
			acquireEvaluationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireEvaluationLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.acquire.stages.service.model.AcquireEvaluation
		deleteAcquireEvaluation(
			com.nbp.acquire.stages.service.model.AcquireEvaluation
				acquireEvaluation) {

		return _acquireEvaluationLocalService.deleteAcquireEvaluation(
			acquireEvaluation);
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
	@Override
	public com.nbp.acquire.stages.service.model.AcquireEvaluation
			deleteAcquireEvaluation(long acquireEvaluationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireEvaluationLocalService.deleteAcquireEvaluation(
			acquireEvaluationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireEvaluationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireEvaluationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireEvaluationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireEvaluationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _acquireEvaluationLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _acquireEvaluationLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _acquireEvaluationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _acquireEvaluationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _acquireEvaluationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireEvaluation
		fetchAcquireEvaluation(long acquireEvaluationId) {

		return _acquireEvaluationLocalService.fetchAcquireEvaluation(
			acquireEvaluationId);
	}

	/**
	 * Returns the acquire evaluation with the primary key.
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation
	 * @throws PortalException if a acquire evaluation with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireEvaluation
			getAcquireEvaluation(long acquireEvaluationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireEvaluationLocalService.getAcquireEvaluation(
			acquireEvaluationId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireEvaluation
			getAcquireEvaluationBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireEvaluationException {

		return _acquireEvaluationLocalService.getAcquireEvaluationBy_CI(caseId);
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
	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireEvaluation>
			getAcquireEvaluations(int start, int end) {

		return _acquireEvaluationLocalService.getAcquireEvaluations(start, end);
	}

	/**
	 * Returns the number of acquire evaluations.
	 *
	 * @return the number of acquire evaluations
	 */
	@Override
	public int getAcquireEvaluationsCount() {
		return _acquireEvaluationLocalService.getAcquireEvaluationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireEvaluationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireEvaluationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireEvaluationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireEvaluationLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireEvaluation
		updateAcquireApplicationEvaluation(
			String caseId, String typeOfCommittee,
			java.util.Date dateOfCommitteeDecision, String committeeDecision) {

		return _acquireEvaluationLocalService.
			updateAcquireApplicationEvaluation(
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
	@Override
	public com.nbp.acquire.stages.service.model.AcquireEvaluation
		updateAcquireEvaluation(
			com.nbp.acquire.stages.service.model.AcquireEvaluation
				acquireEvaluation) {

		return _acquireEvaluationLocalService.updateAcquireEvaluation(
			acquireEvaluation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireEvaluationLocalService.getBasePersistence();
	}

	@Override
	public AcquireEvaluationLocalService getWrappedService() {
		return _acquireEvaluationLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireEvaluationLocalService acquireEvaluationLocalService) {

		_acquireEvaluationLocalService = acquireEvaluationLocalService;
	}

	private AcquireEvaluationLocalService _acquireEvaluationLocalService;

}