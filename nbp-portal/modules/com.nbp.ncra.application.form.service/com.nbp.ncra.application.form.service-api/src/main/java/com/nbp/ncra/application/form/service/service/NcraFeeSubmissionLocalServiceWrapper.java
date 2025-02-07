/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcraFeeSubmissionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraFeeSubmissionLocalService
 * @generated
 */
public class NcraFeeSubmissionLocalServiceWrapper
	implements NcraFeeSubmissionLocalService,
			   ServiceWrapper<NcraFeeSubmissionLocalService> {

	public NcraFeeSubmissionLocalServiceWrapper() {
		this(null);
	}

	public NcraFeeSubmissionLocalServiceWrapper(
		NcraFeeSubmissionLocalService ncraFeeSubmissionLocalService) {

		_ncraFeeSubmissionLocalService = ncraFeeSubmissionLocalService;
	}

	/**
	 * Adds the ncra fee submission to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraFeeSubmissionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraFeeSubmission the ncra fee submission
	 * @return the ncra fee submission that was added
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraFeeSubmission
		addNcraFeeSubmission(
			com.nbp.ncra.application.form.service.model.NcraFeeSubmission
				ncraFeeSubmission) {

		return _ncraFeeSubmissionLocalService.addNcraFeeSubmission(
			ncraFeeSubmission);
	}

	/**
	 * Creates a new ncra fee submission with the primary key. Does not add the ncra fee submission to the database.
	 *
	 * @param ncraFeeSubmissionId the primary key for the new ncra fee submission
	 * @return the new ncra fee submission
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraFeeSubmission
		createNcraFeeSubmission(long ncraFeeSubmissionId) {

		return _ncraFeeSubmissionLocalService.createNcraFeeSubmission(
			ncraFeeSubmissionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraFeeSubmissionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncra fee submission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraFeeSubmissionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraFeeSubmissionId the primary key of the ncra fee submission
	 * @return the ncra fee submission that was removed
	 * @throws PortalException if a ncra fee submission with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraFeeSubmission
			deleteNcraFeeSubmission(long ncraFeeSubmissionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraFeeSubmissionLocalService.deleteNcraFeeSubmission(
			ncraFeeSubmissionId);
	}

	/**
	 * Deletes the ncra fee submission from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraFeeSubmissionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraFeeSubmission the ncra fee submission
	 * @return the ncra fee submission that was removed
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraFeeSubmission
		deleteNcraFeeSubmission(
			com.nbp.ncra.application.form.service.model.NcraFeeSubmission
				ncraFeeSubmission) {

		return _ncraFeeSubmissionLocalService.deleteNcraFeeSubmission(
			ncraFeeSubmission);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraFeeSubmissionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncraFeeSubmissionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncraFeeSubmissionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncraFeeSubmissionLocalService.dynamicQuery();
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

		return _ncraFeeSubmissionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraFeeSubmissionModelImpl</code>.
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

		return _ncraFeeSubmissionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraFeeSubmissionModelImpl</code>.
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

		return _ncraFeeSubmissionLocalService.dynamicQuery(
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

		return _ncraFeeSubmissionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncraFeeSubmissionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraFeeSubmission
		fetchNcraFeeSubmission(long ncraFeeSubmissionId) {

		return _ncraFeeSubmissionLocalService.fetchNcraFeeSubmission(
			ncraFeeSubmissionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncraFeeSubmissionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncraFeeSubmissionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraFeeSubmission
			getNcraFee_By_NCRA_Id(long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraFeeSubmissionException {

		return _ncraFeeSubmissionLocalService.getNcraFee_By_NCRA_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the ncra fee submission with the primary key.
	 *
	 * @param ncraFeeSubmissionId the primary key of the ncra fee submission
	 * @return the ncra fee submission
	 * @throws PortalException if a ncra fee submission with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraFeeSubmission
			getNcraFeeSubmission(long ncraFeeSubmissionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraFeeSubmissionLocalService.getNcraFeeSubmission(
			ncraFeeSubmissionId);
	}

	/**
	 * Returns a range of all the ncra fee submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraFeeSubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra fee submissions
	 * @param end the upper bound of the range of ncra fee submissions (not inclusive)
	 * @return the range of ncra fee submissions
	 */
	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.NcraFeeSubmission>
			getNcraFeeSubmissions(int start, int end) {

		return _ncraFeeSubmissionLocalService.getNcraFeeSubmissions(start, end);
	}

	/**
	 * Returns the number of ncra fee submissions.
	 *
	 * @return the number of ncra fee submissions
	 */
	@Override
	public int getNcraFeeSubmissionsCount() {
		return _ncraFeeSubmissionLocalService.getNcraFeeSubmissionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraFeeSubmissionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraFeeSubmissionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncra fee submission in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraFeeSubmissionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraFeeSubmission the ncra fee submission
	 * @return the ncra fee submission that was updated
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraFeeSubmission
		updateNcraFeeSubmission(
			com.nbp.ncra.application.form.service.model.NcraFeeSubmission
				ncraFeeSubmission) {

		return _ncraFeeSubmissionLocalService.updateNcraFeeSubmission(
			ncraFeeSubmission);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncraFeeSubmissionLocalService.getBasePersistence();
	}

	@Override
	public NcraFeeSubmissionLocalService getWrappedService() {
		return _ncraFeeSubmissionLocalService;
	}

	@Override
	public void setWrappedService(
		NcraFeeSubmissionLocalService ncraFeeSubmissionLocalService) {

		_ncraFeeSubmissionLocalService = ncraFeeSubmissionLocalService;
	}

	private NcraFeeSubmissionLocalService _ncraFeeSubmissionLocalService;

}