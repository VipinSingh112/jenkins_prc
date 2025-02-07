/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DetailOfApplicantLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantLocalService
 * @generated
 */
public class DetailOfApplicantLocalServiceWrapper
	implements DetailOfApplicantLocalService,
			   ServiceWrapper<DetailOfApplicantLocalService> {

	public DetailOfApplicantLocalServiceWrapper() {
		this(null);
	}

	public DetailOfApplicantLocalServiceWrapper(
		DetailOfApplicantLocalService detailOfApplicantLocalService) {

		_detailOfApplicantLocalService = detailOfApplicantLocalService;
	}

	/**
	 * Adds the detail of applicant to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicant the detail of applicant
	 * @return the detail of applicant that was added
	 */
	@Override
	public com.nbp.osi.application.form.services.model.DetailOfApplicant
		addDetailOfApplicant(
			com.nbp.osi.application.form.services.model.DetailOfApplicant
				detailOfApplicant) {

		return _detailOfApplicantLocalService.addDetailOfApplicant(
			detailOfApplicant);
	}

	/**
	 * Creates a new detail of applicant with the primary key. Does not add the detail of applicant to the database.
	 *
	 * @param detailOfApplicantId the primary key for the new detail of applicant
	 * @return the new detail of applicant
	 */
	@Override
	public com.nbp.osi.application.form.services.model.DetailOfApplicant
		createDetailOfApplicant(long detailOfApplicantId) {

		return _detailOfApplicantLocalService.createDetailOfApplicant(
			detailOfApplicantId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfApplicantLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void delete_OSI_DOA_OAI(long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		_detailOfApplicantLocalService.delete_OSI_DOA_OAI(osiApplicationId);
	}

	/**
	 * Deletes the detail of applicant from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicant the detail of applicant
	 * @return the detail of applicant that was removed
	 */
	@Override
	public com.nbp.osi.application.form.services.model.DetailOfApplicant
		deleteDetailOfApplicant(
			com.nbp.osi.application.form.services.model.DetailOfApplicant
				detailOfApplicant) {

		return _detailOfApplicantLocalService.deleteDetailOfApplicant(
			detailOfApplicant);
	}

	/**
	 * Deletes the detail of applicant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant that was removed
	 * @throws PortalException if a detail of applicant with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.DetailOfApplicant
			deleteDetailOfApplicant(long detailOfApplicantId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfApplicantLocalService.deleteDetailOfApplicant(
			detailOfApplicantId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfApplicantLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _detailOfApplicantLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _detailOfApplicantLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _detailOfApplicantLocalService.dynamicQuery();
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

		return _detailOfApplicantLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.DetailOfApplicantModelImpl</code>.
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

		return _detailOfApplicantLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.DetailOfApplicantModelImpl</code>.
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

		return _detailOfApplicantLocalService.dynamicQuery(
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

		return _detailOfApplicantLocalService.dynamicQueryCount(dynamicQuery);
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

		return _detailOfApplicantLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.application.form.services.model.DetailOfApplicant
		fetchDetailOfApplicant(long detailOfApplicantId) {

		return _detailOfApplicantLocalService.fetchDetailOfApplicant(
			detailOfApplicantId);
	}

	/**
	 * Returns the detail of applicant matching the UUID and group.
	 *
	 * @param uuid the detail of applicant's UUID
	 * @param groupId the primary key of the group
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.DetailOfApplicant
		fetchDetailOfApplicantByUuidAndGroupId(String uuid, long groupId) {

		return _detailOfApplicantLocalService.
			fetchDetailOfApplicantByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _detailOfApplicantLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the detail of applicant with the primary key.
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant
	 * @throws PortalException if a detail of applicant with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.DetailOfApplicant
			getDetailOfApplicant(long detailOfApplicantId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfApplicantLocalService.getDetailOfApplicant(
			detailOfApplicantId);
	}

	/**
	 * Returns the detail of applicant matching the UUID and group.
	 *
	 * @param uuid the detail of applicant's UUID
	 * @param groupId the primary key of the group
	 * @return the matching detail of applicant
	 * @throws PortalException if a matching detail of applicant could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.DetailOfApplicant
			getDetailOfApplicantByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfApplicantLocalService.
			getDetailOfApplicantByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the detail of applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @return the range of detail of applicants
	 */
	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.DetailOfApplicant>
			getDetailOfApplicants(int start, int end) {

		return _detailOfApplicantLocalService.getDetailOfApplicants(start, end);
	}

	/**
	 * Returns all the detail of applicants matching the UUID and company.
	 *
	 * @param uuid the UUID of the detail of applicants
	 * @param companyId the primary key of the company
	 * @return the matching detail of applicants, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.DetailOfApplicant>
			getDetailOfApplicantsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _detailOfApplicantLocalService.
			getDetailOfApplicantsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of detail of applicants matching the UUID and company.
	 *
	 * @param uuid the UUID of the detail of applicants
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching detail of applicants, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.DetailOfApplicant>
			getDetailOfApplicantsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.osi.application.form.services.model.
						DetailOfApplicant> orderByComparator) {

		return _detailOfApplicantLocalService.
			getDetailOfApplicantsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of detail of applicants.
	 *
	 * @return the number of detail of applicants
	 */
	@Override
	public int getDetailOfApplicantsCount() {
		return _detailOfApplicantLocalService.getDetailOfApplicantsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _detailOfApplicantLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _detailOfApplicantLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _detailOfApplicantLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.application.form.services.model.DetailOfApplicant
			getOsiById(long applicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return _detailOfApplicantLocalService.getOsiById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _detailOfApplicantLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the detail of applicant in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicant the detail of applicant
	 * @return the detail of applicant that was updated
	 */
	@Override
	public com.nbp.osi.application.form.services.model.DetailOfApplicant
		updateDetailOfApplicant(
			com.nbp.osi.application.form.services.model.DetailOfApplicant
				detailOfApplicant) {

		return _detailOfApplicantLocalService.updateDetailOfApplicant(
			detailOfApplicant);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _detailOfApplicantLocalService.getBasePersistence();
	}

	@Override
	public DetailOfApplicantLocalService getWrappedService() {
		return _detailOfApplicantLocalService;
	}

	@Override
	public void setWrappedService(
		DetailOfApplicantLocalService detailOfApplicantLocalService) {

		_detailOfApplicantLocalService = detailOfApplicantLocalService;
	}

	private DetailOfApplicantLocalService _detailOfApplicantLocalService;

}