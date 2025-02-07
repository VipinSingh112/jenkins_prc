/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiicApplicantDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicantDetailsLocalService
 * @generated
 */
public class MiicApplicantDetailsLocalServiceWrapper
	implements MiicApplicantDetailsLocalService,
			   ServiceWrapper<MiicApplicantDetailsLocalService> {

	public MiicApplicantDetailsLocalServiceWrapper() {
		this(null);
	}

	public MiicApplicantDetailsLocalServiceWrapper(
		MiicApplicantDetailsLocalService miicApplicantDetailsLocalService) {

		_miicApplicantDetailsLocalService = miicApplicantDetailsLocalService;
	}

	/**
	 * Adds the miic applicant details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicantDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicantDetails the miic applicant details
	 * @return the miic applicant details that was added
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplicantDetails
		addMiicApplicantDetails(
			com.nbp.miic.application.form.services.model.MiicApplicantDetails
				miicApplicantDetails) {

		return _miicApplicantDetailsLocalService.addMiicApplicantDetails(
			miicApplicantDetails);
	}

	/**
	 * Creates a new miic applicant details with the primary key. Does not add the miic applicant details to the database.
	 *
	 * @param miicApplicantDetailsId the primary key for the new miic applicant details
	 * @return the new miic applicant details
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplicantDetails
		createMiicApplicantDetails(long miicApplicantDetailsId) {

		return _miicApplicantDetailsLocalService.createMiicApplicantDetails(
			miicApplicantDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicantDetailsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the miic applicant details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicantDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicantDetailsId the primary key of the miic applicant details
	 * @return the miic applicant details that was removed
	 * @throws PortalException if a miic applicant details with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplicantDetails
			deleteMiicApplicantDetails(long miicApplicantDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicantDetailsLocalService.deleteMiicApplicantDetails(
			miicApplicantDetailsId);
	}

	/**
	 * Deletes the miic applicant details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicantDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicantDetails the miic applicant details
	 * @return the miic applicant details that was removed
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplicantDetails
		deleteMiicApplicantDetails(
			com.nbp.miic.application.form.services.model.MiicApplicantDetails
				miicApplicantDetails) {

		return _miicApplicantDetailsLocalService.deleteMiicApplicantDetails(
			miicApplicantDetails);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicantDetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miicApplicantDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miicApplicantDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miicApplicantDetailsLocalService.dynamicQuery();
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

		return _miicApplicantDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicantDetailsModelImpl</code>.
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

		return _miicApplicantDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicantDetailsModelImpl</code>.
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

		return _miicApplicantDetailsLocalService.dynamicQuery(
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

		return _miicApplicantDetailsLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _miicApplicantDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicApplicantDetails
		fetchMiicApplicantDetails(long miicApplicantDetailsId) {

		return _miicApplicantDetailsLocalService.fetchMiicApplicantDetails(
			miicApplicantDetailsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miicApplicantDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miicApplicantDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the miic applicant details with the primary key.
	 *
	 * @param miicApplicantDetailsId the primary key of the miic applicant details
	 * @return the miic applicant details
	 * @throws PortalException if a miic applicant details with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplicantDetails
			getMiicApplicantDetails(long miicApplicantDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicantDetailsLocalService.getMiicApplicantDetails(
			miicApplicantDetailsId);
	}

	/**
	 * Returns a range of all the miic applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applicant detailses
	 * @param end the upper bound of the range of miic applicant detailses (not inclusive)
	 * @return the range of miic applicant detailses
	 */
	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicApplicantDetails>
			getMiicApplicantDetailses(int start, int end) {

		return _miicApplicantDetailsLocalService.getMiicApplicantDetailses(
			start, end);
	}

	/**
	 * Returns the number of miic applicant detailses.
	 *
	 * @return the number of miic applicant detailses
	 */
	@Override
	public int getMiicApplicantDetailsesCount() {
		return _miicApplicantDetailsLocalService.
			getMiicApplicantDetailsesCount();
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicApplicantDetails
			getMiicById(long applicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicantDetailsException {

		return _miicApplicantDetailsLocalService.getMiicById(applicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicApplicantDetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicantDetailsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the miic applicant details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicantDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicantDetails the miic applicant details
	 * @return the miic applicant details that was updated
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplicantDetails
		updateMiicApplicantDetails(
			com.nbp.miic.application.form.services.model.MiicApplicantDetails
				miicApplicantDetails) {

		return _miicApplicantDetailsLocalService.updateMiicApplicantDetails(
			miicApplicantDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miicApplicantDetailsLocalService.getBasePersistence();
	}

	@Override
	public MiicApplicantDetailsLocalService getWrappedService() {
		return _miicApplicantDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		MiicApplicantDetailsLocalService miicApplicantDetailsLocalService) {

		_miicApplicantDetailsLocalService = miicApplicantDetailsLocalService;
	}

	private MiicApplicantDetailsLocalService _miicApplicantDetailsLocalService;

}