/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AssessmentIndividualPersonalDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssessmentIndividualPersonalDetailsLocalService
 * @generated
 */
public class AssessmentIndividualPersonalDetailsLocalServiceWrapper
	implements AssessmentIndividualPersonalDetailsLocalService,
			   ServiceWrapper<AssessmentIndividualPersonalDetailsLocalService> {

	public AssessmentIndividualPersonalDetailsLocalServiceWrapper() {
		this(null);
	}

	public AssessmentIndividualPersonalDetailsLocalServiceWrapper(
		AssessmentIndividualPersonalDetailsLocalService
			assessmentIndividualPersonalDetailsLocalService) {

		_assessmentIndividualPersonalDetailsLocalService =
			assessmentIndividualPersonalDetailsLocalService;
	}

	/**
	 * Adds the assessment individual personal details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssessmentIndividualPersonalDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assessmentIndividualPersonalDetails the assessment individual personal details
	 * @return the assessment individual personal details that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssessmentIndividualPersonalDetails
			addAssessmentIndividualPersonalDetails(
				com.nbp.osi.insolvency.application.form.services.model.
					AssessmentIndividualPersonalDetails
						assessmentIndividualPersonalDetails) {

		return _assessmentIndividualPersonalDetailsLocalService.
			addAssessmentIndividualPersonalDetails(
				assessmentIndividualPersonalDetails);
	}

	/**
	 * Creates a new assessment individual personal details with the primary key. Does not add the assessment individual personal details to the database.
	 *
	 * @param assessmentDetailsId the primary key for the new assessment individual personal details
	 * @return the new assessment individual personal details
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssessmentIndividualPersonalDetails
			createAssessmentIndividualPersonalDetails(
				long assessmentDetailsId) {

		return _assessmentIndividualPersonalDetailsLocalService.
			createAssessmentIndividualPersonalDetails(assessmentDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assessmentIndividualPersonalDetailsLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the assessment individual personal details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssessmentIndividualPersonalDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assessmentIndividualPersonalDetails the assessment individual personal details
	 * @return the assessment individual personal details that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssessmentIndividualPersonalDetails
			deleteAssessmentIndividualPersonalDetails(
				com.nbp.osi.insolvency.application.form.services.model.
					AssessmentIndividualPersonalDetails
						assessmentIndividualPersonalDetails) {

		return _assessmentIndividualPersonalDetailsLocalService.
			deleteAssessmentIndividualPersonalDetails(
				assessmentIndividualPersonalDetails);
	}

	/**
	 * Deletes the assessment individual personal details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssessmentIndividualPersonalDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assessmentDetailsId the primary key of the assessment individual personal details
	 * @return the assessment individual personal details that was removed
	 * @throws PortalException if a assessment individual personal details with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssessmentIndividualPersonalDetails
				deleteAssessmentIndividualPersonalDetails(
					long assessmentDetailsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _assessmentIndividualPersonalDetailsLocalService.
			deleteAssessmentIndividualPersonalDetails(assessmentDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assessmentIndividualPersonalDetailsLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _assessmentIndividualPersonalDetailsLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _assessmentIndividualPersonalDetailsLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assessmentIndividualPersonalDetailsLocalService.dynamicQuery();
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

		return _assessmentIndividualPersonalDetailsLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssessmentIndividualPersonalDetailsModelImpl</code>.
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

		return _assessmentIndividualPersonalDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssessmentIndividualPersonalDetailsModelImpl</code>.
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

		return _assessmentIndividualPersonalDetailsLocalService.dynamicQuery(
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

		return _assessmentIndividualPersonalDetailsLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _assessmentIndividualPersonalDetailsLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssessmentIndividualPersonalDetails
			fetchAssessmentIndividualPersonalDetails(long assessmentDetailsId) {

		return _assessmentIndividualPersonalDetailsLocalService.
			fetchAssessmentIndividualPersonalDetails(assessmentDetailsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _assessmentIndividualPersonalDetailsLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the assessment individual personal details with the primary key.
	 *
	 * @param assessmentDetailsId the primary key of the assessment individual personal details
	 * @return the assessment individual personal details
	 * @throws PortalException if a assessment individual personal details with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssessmentIndividualPersonalDetails
				getAssessmentIndividualPersonalDetails(long assessmentDetailsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _assessmentIndividualPersonalDetailsLocalService.
			getAssessmentIndividualPersonalDetails(assessmentDetailsId);
	}

	/**
	 * Returns a range of all the assessment individual personal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssessmentIndividualPersonalDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment individual personal detailses
	 * @param end the upper bound of the range of assessment individual personal detailses (not inclusive)
	 * @return the range of assessment individual personal detailses
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			AssessmentIndividualPersonalDetails>
				getAssessmentIndividualPersonalDetailses(int start, int end) {

		return _assessmentIndividualPersonalDetailsLocalService.
			getAssessmentIndividualPersonalDetailses(start, end);
	}

	/**
	 * Returns the number of assessment individual personal detailses.
	 *
	 * @return the number of assessment individual personal detailses
	 */
	@Override
	public int getAssessmentIndividualPersonalDetailsesCount() {
		return _assessmentIndividualPersonalDetailsLocalService.
			getAssessmentIndividualPersonalDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _assessmentIndividualPersonalDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assessmentIndividualPersonalDetailsLocalService.
			getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssessmentIndividualPersonalDetails getOsiById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchAssessmentIndividualPersonalDetailsException {

		return _assessmentIndividualPersonalDetailsLocalService.getOsiById(
			osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assessmentIndividualPersonalDetailsLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the assessment individual personal details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssessmentIndividualPersonalDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assessmentIndividualPersonalDetails the assessment individual personal details
	 * @return the assessment individual personal details that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssessmentIndividualPersonalDetails
			updateAssessmentIndividualPersonalDetails(
				com.nbp.osi.insolvency.application.form.services.model.
					AssessmentIndividualPersonalDetails
						assessmentIndividualPersonalDetails) {

		return _assessmentIndividualPersonalDetailsLocalService.
			updateAssessmentIndividualPersonalDetails(
				assessmentIndividualPersonalDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _assessmentIndividualPersonalDetailsLocalService.
			getBasePersistence();
	}

	@Override
	public AssessmentIndividualPersonalDetailsLocalService getWrappedService() {
		return _assessmentIndividualPersonalDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		AssessmentIndividualPersonalDetailsLocalService
			assessmentIndividualPersonalDetailsLocalService) {

		_assessmentIndividualPersonalDetailsLocalService =
			assessmentIndividualPersonalDetailsLocalService;
	}

	private AssessmentIndividualPersonalDetailsLocalService
		_assessmentIndividualPersonalDetailsLocalService;

}