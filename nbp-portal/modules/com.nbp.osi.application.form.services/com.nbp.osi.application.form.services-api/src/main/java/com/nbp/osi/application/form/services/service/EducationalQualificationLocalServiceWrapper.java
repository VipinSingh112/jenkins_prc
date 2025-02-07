/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link EducationalQualificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EducationalQualificationLocalService
 * @generated
 */
public class EducationalQualificationLocalServiceWrapper
	implements EducationalQualificationLocalService,
			   ServiceWrapper<EducationalQualificationLocalService> {

	public EducationalQualificationLocalServiceWrapper() {
		this(null);
	}

	public EducationalQualificationLocalServiceWrapper(
		EducationalQualificationLocalService
			educationalQualificationLocalService) {

		_educationalQualificationLocalService =
			educationalQualificationLocalService;
	}

	/**
	 * Adds the educational qualification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EducationalQualificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param educationalQualification the educational qualification
	 * @return the educational qualification that was added
	 */
	@Override
	public com.nbp.osi.application.form.services.model.EducationalQualification
		addEducationalQualification(
			com.nbp.osi.application.form.services.model.EducationalQualification
				educationalQualification) {

		return _educationalQualificationLocalService.
			addEducationalQualification(educationalQualification);
	}

	/**
	 * Creates a new educational qualification with the primary key. Does not add the educational qualification to the database.
	 *
	 * @param educationalDetailId the primary key for the new educational qualification
	 * @return the new educational qualification
	 */
	@Override
	public com.nbp.osi.application.form.services.model.EducationalQualification
		createEducationalQualification(long educationalDetailId) {

		return _educationalQualificationLocalService.
			createEducationalQualification(educationalDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _educationalQualificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void delete_OSI_EQ_OAI(long osiApplicationId) {
		_educationalQualificationLocalService.delete_OSI_EQ_OAI(
			osiApplicationId);
	}

	/**
	 * Deletes the educational qualification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EducationalQualificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param educationalQualification the educational qualification
	 * @return the educational qualification that was removed
	 */
	@Override
	public com.nbp.osi.application.form.services.model.EducationalQualification
		deleteEducationalQualification(
			com.nbp.osi.application.form.services.model.EducationalQualification
				educationalQualification) {

		return _educationalQualificationLocalService.
			deleteEducationalQualification(educationalQualification);
	}

	/**
	 * Deletes the educational qualification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EducationalQualificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification that was removed
	 * @throws PortalException if a educational qualification with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.EducationalQualification
			deleteEducationalQualification(long educationalDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _educationalQualificationLocalService.
			deleteEducationalQualification(educationalDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _educationalQualificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _educationalQualificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _educationalQualificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _educationalQualificationLocalService.dynamicQuery();
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

		return _educationalQualificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.EducationalQualificationModelImpl</code>.
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

		return _educationalQualificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.EducationalQualificationModelImpl</code>.
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

		return _educationalQualificationLocalService.dynamicQuery(
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

		return _educationalQualificationLocalService.dynamicQueryCount(
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

		return _educationalQualificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.application.form.services.model.EducationalQualification
		fetchEducationalQualification(long educationalDetailId) {

		return _educationalQualificationLocalService.
			fetchEducationalQualification(educationalDetailId);
	}

	/**
	 * Returns the educational qualification matching the UUID and group.
	 *
	 * @param uuid the educational qualification's UUID
	 * @param groupId the primary key of the group
	 * @return the matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.EducationalQualification
		fetchEducationalQualificationByUuidAndGroupId(
			String uuid, long groupId) {

		return _educationalQualificationLocalService.
			fetchEducationalQualificationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _educationalQualificationLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the educational qualification with the primary key.
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification
	 * @throws PortalException if a educational qualification with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.EducationalQualification
			getEducationalQualification(long educationalDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _educationalQualificationLocalService.
			getEducationalQualification(educationalDetailId);
	}

	/**
	 * Returns the educational qualification matching the UUID and group.
	 *
	 * @param uuid the educational qualification's UUID
	 * @param groupId the primary key of the group
	 * @return the matching educational qualification
	 * @throws PortalException if a matching educational qualification could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.EducationalQualification
			getEducationalQualificationByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _educationalQualificationLocalService.
			getEducationalQualificationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the educational qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @return the range of educational qualifications
	 */
	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.EducationalQualification>
			getEducationalQualifications(int start, int end) {

		return _educationalQualificationLocalService.
			getEducationalQualifications(start, end);
	}

	/**
	 * Returns all the educational qualifications matching the UUID and company.
	 *
	 * @param uuid the UUID of the educational qualifications
	 * @param companyId the primary key of the company
	 * @return the matching educational qualifications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.EducationalQualification>
			getEducationalQualificationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _educationalQualificationLocalService.
			getEducationalQualificationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of educational qualifications matching the UUID and company.
	 *
	 * @param uuid the UUID of the educational qualifications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching educational qualifications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.EducationalQualification>
			getEducationalQualificationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.osi.application.form.services.model.
						EducationalQualification> orderByComparator) {

		return _educationalQualificationLocalService.
			getEducationalQualificationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of educational qualifications.
	 *
	 * @return the number of educational qualifications
	 */
	@Override
	public int getEducationalQualificationsCount() {
		return _educationalQualificationLocalService.
			getEducationalQualificationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _educationalQualificationLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _educationalQualificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _educationalQualificationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.EducationalQualification>
			getosiById(long applicationId) {

		return _educationalQualificationLocalService.getosiById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _educationalQualificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the educational qualification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EducationalQualificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param educationalQualification the educational qualification
	 * @return the educational qualification that was updated
	 */
	@Override
	public com.nbp.osi.application.form.services.model.EducationalQualification
		updateEducationalQualification(
			com.nbp.osi.application.form.services.model.EducationalQualification
				educationalQualification) {

		return _educationalQualificationLocalService.
			updateEducationalQualification(educationalQualification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _educationalQualificationLocalService.getBasePersistence();
	}

	@Override
	public EducationalQualificationLocalService getWrappedService() {
		return _educationalQualificationLocalService;
	}

	@Override
	public void setWrappedService(
		EducationalQualificationLocalService
			educationalQualificationLocalService) {

		_educationalQualificationLocalService =
			educationalQualificationLocalService;
	}

	private EducationalQualificationLocalService
		_educationalQualificationLocalService;

}