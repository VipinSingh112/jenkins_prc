/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddApplicantPractitionerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddApplicantPractitionerLocalService
 * @generated
 */
public class AddApplicantPractitionerLocalServiceWrapper
	implements AddApplicantPractitionerLocalService,
			   ServiceWrapper<AddApplicantPractitionerLocalService> {

	public AddApplicantPractitionerLocalServiceWrapper() {
		this(null);
	}

	public AddApplicantPractitionerLocalServiceWrapper(
		AddApplicantPractitionerLocalService
			addApplicantPractitionerLocalService) {

		_addApplicantPractitionerLocalService =
			addApplicantPractitionerLocalService;
	}

	/**
	 * Adds the add applicant practitioner to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddApplicantPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addApplicantPractitioner the add applicant practitioner
	 * @return the add applicant practitioner that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddApplicantPractitioner
		addAddApplicantPractitioner(
			com.nbp.hsra.application.service.model.AddApplicantPractitioner
				addApplicantPractitioner) {

		return _addApplicantPractitionerLocalService.
			addAddApplicantPractitioner(addApplicantPractitioner);
	}

	/**
	 * Creates a new add applicant practitioner with the primary key. Does not add the add applicant practitioner to the database.
	 *
	 * @param addApplicantPractitionerId the primary key for the new add applicant practitioner
	 * @return the new add applicant practitioner
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddApplicantPractitioner
		createAddApplicantPractitioner(long addApplicantPractitionerId) {

		return _addApplicantPractitionerLocalService.
			createAddApplicantPractitioner(addApplicantPractitionerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addApplicantPractitionerLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add applicant practitioner from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddApplicantPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addApplicantPractitioner the add applicant practitioner
	 * @return the add applicant practitioner that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddApplicantPractitioner
		deleteAddApplicantPractitioner(
			com.nbp.hsra.application.service.model.AddApplicantPractitioner
				addApplicantPractitioner) {

		return _addApplicantPractitionerLocalService.
			deleteAddApplicantPractitioner(addApplicantPractitioner);
	}

	/**
	 * Deletes the add applicant practitioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddApplicantPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addApplicantPractitionerId the primary key of the add applicant practitioner
	 * @return the add applicant practitioner that was removed
	 * @throws PortalException if a add applicant practitioner with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddApplicantPractitioner
			deleteAddApplicantPractitioner(long addApplicantPractitionerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addApplicantPractitionerLocalService.
			deleteAddApplicantPractitioner(addApplicantPractitionerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addApplicantPractitionerLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addApplicantPractitionerLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addApplicantPractitionerLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addApplicantPractitionerLocalService.dynamicQuery();
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

		return _addApplicantPractitionerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddApplicantPractitionerModelImpl</code>.
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

		return _addApplicantPractitionerLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddApplicantPractitionerModelImpl</code>.
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

		return _addApplicantPractitionerLocalService.dynamicQuery(
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

		return _addApplicantPractitionerLocalService.dynamicQueryCount(
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

		return _addApplicantPractitionerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.AddApplicantPractitioner
		fetchAddApplicantPractitioner(long addApplicantPractitionerId) {

		return _addApplicantPractitionerLocalService.
			fetchAddApplicantPractitioner(addApplicantPractitionerId);
	}

	/**
	 * Returns the add applicant practitioner matching the UUID and group.
	 *
	 * @param uuid the add applicant practitioner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddApplicantPractitioner
		fetchAddApplicantPractitionerByUuidAndGroupId(
			String uuid, long groupId) {

		return _addApplicantPractitionerLocalService.
			fetchAddApplicantPractitionerByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addApplicantPractitionerLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the add applicant practitioner with the primary key.
	 *
	 * @param addApplicantPractitionerId the primary key of the add applicant practitioner
	 * @return the add applicant practitioner
	 * @throws PortalException if a add applicant practitioner with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddApplicantPractitioner
			getAddApplicantPractitioner(long addApplicantPractitionerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addApplicantPractitionerLocalService.
			getAddApplicantPractitioner(addApplicantPractitionerId);
	}

	/**
	 * Returns the add applicant practitioner matching the UUID and group.
	 *
	 * @param uuid the add applicant practitioner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching add applicant practitioner
	 * @throws PortalException if a matching add applicant practitioner could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddApplicantPractitioner
			getAddApplicantPractitionerByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addApplicantPractitionerLocalService.
			getAddApplicantPractitionerByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the add applicant practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @return the range of add applicant practitioners
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AddApplicantPractitioner>
			getAddApplicantPractitioners(int start, int end) {

		return _addApplicantPractitionerLocalService.
			getAddApplicantPractitioners(start, end);
	}

	/**
	 * Returns all the add applicant practitioners matching the UUID and company.
	 *
	 * @param uuid the UUID of the add applicant practitioners
	 * @param companyId the primary key of the company
	 * @return the matching add applicant practitioners, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AddApplicantPractitioner>
			getAddApplicantPractitionersByUuidAndCompanyId(
				String uuid, long companyId) {

		return _addApplicantPractitionerLocalService.
			getAddApplicantPractitionersByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of add applicant practitioners matching the UUID and company.
	 *
	 * @param uuid the UUID of the add applicant practitioners
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching add applicant practitioners, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AddApplicantPractitioner>
			getAddApplicantPractitionersByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.hsra.application.service.model.
						AddApplicantPractitioner> orderByComparator) {

		return _addApplicantPractitionerLocalService.
			getAddApplicantPractitionersByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of add applicant practitioners.
	 *
	 * @return the number of add applicant practitioners
	 */
	@Override
	public int getAddApplicantPractitionersCount() {
		return _addApplicantPractitionerLocalService.
			getAddApplicantPractitionersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _addApplicantPractitionerLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addApplicantPractitionerLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addApplicantPractitionerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addApplicantPractitionerLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add applicant practitioner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddApplicantPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addApplicantPractitioner the add applicant practitioner
	 * @return the add applicant practitioner that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddApplicantPractitioner
		updateAddApplicantPractitioner(
			com.nbp.hsra.application.service.model.AddApplicantPractitioner
				addApplicantPractitioner) {

		return _addApplicantPractitionerLocalService.
			updateAddApplicantPractitioner(addApplicantPractitioner);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addApplicantPractitionerLocalService.getBasePersistence();
	}

	@Override
	public AddApplicantPractitionerLocalService getWrappedService() {
		return _addApplicantPractitionerLocalService;
	}

	@Override
	public void setWrappedService(
		AddApplicantPractitionerLocalService
			addApplicantPractitionerLocalService) {

		_addApplicantPractitionerLocalService =
			addApplicantPractitionerLocalService;
	}

	private AddApplicantPractitionerLocalService
		_addApplicantPractitionerLocalService;

}