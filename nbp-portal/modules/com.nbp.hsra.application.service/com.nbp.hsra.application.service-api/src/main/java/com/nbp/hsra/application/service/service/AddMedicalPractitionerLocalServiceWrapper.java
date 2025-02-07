/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddMedicalPractitionerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddMedicalPractitionerLocalService
 * @generated
 */
public class AddMedicalPractitionerLocalServiceWrapper
	implements AddMedicalPractitionerLocalService,
			   ServiceWrapper<AddMedicalPractitionerLocalService> {

	public AddMedicalPractitionerLocalServiceWrapper() {
		this(null);
	}

	public AddMedicalPractitionerLocalServiceWrapper(
		AddMedicalPractitionerLocalService addMedicalPractitionerLocalService) {

		_addMedicalPractitionerLocalService =
			addMedicalPractitionerLocalService;
	}

	/**
	 * Adds the add medical practitioner to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddMedicalPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addMedicalPractitioner the add medical practitioner
	 * @return the add medical practitioner that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddMedicalPractitioner
		addAddMedicalPractitioner(
			com.nbp.hsra.application.service.model.AddMedicalPractitioner
				addMedicalPractitioner) {

		return _addMedicalPractitionerLocalService.addAddMedicalPractitioner(
			addMedicalPractitioner);
	}

	/**
	 * Creates a new add medical practitioner with the primary key. Does not add the add medical practitioner to the database.
	 *
	 * @param addMedicalPractitionerId the primary key for the new add medical practitioner
	 * @return the new add medical practitioner
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddMedicalPractitioner
		createAddMedicalPractitioner(long addMedicalPractitionerId) {

		return _addMedicalPractitionerLocalService.createAddMedicalPractitioner(
			addMedicalPractitionerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addMedicalPractitionerLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add medical practitioner from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddMedicalPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addMedicalPractitioner the add medical practitioner
	 * @return the add medical practitioner that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddMedicalPractitioner
		deleteAddMedicalPractitioner(
			com.nbp.hsra.application.service.model.AddMedicalPractitioner
				addMedicalPractitioner) {

		return _addMedicalPractitionerLocalService.deleteAddMedicalPractitioner(
			addMedicalPractitioner);
	}

	/**
	 * Deletes the add medical practitioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddMedicalPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner that was removed
	 * @throws PortalException if a add medical practitioner with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddMedicalPractitioner
			deleteAddMedicalPractitioner(long addMedicalPractitionerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addMedicalPractitionerLocalService.deleteAddMedicalPractitioner(
			addMedicalPractitionerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addMedicalPractitionerLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addMedicalPractitionerLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addMedicalPractitionerLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addMedicalPractitionerLocalService.dynamicQuery();
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

		return _addMedicalPractitionerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerModelImpl</code>.
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

		return _addMedicalPractitionerLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerModelImpl</code>.
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

		return _addMedicalPractitionerLocalService.dynamicQuery(
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

		return _addMedicalPractitionerLocalService.dynamicQueryCount(
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

		return _addMedicalPractitionerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.AddMedicalPractitioner
		fetchAddMedicalPractitioner(long addMedicalPractitionerId) {

		return _addMedicalPractitionerLocalService.fetchAddMedicalPractitioner(
			addMedicalPractitionerId);
	}

	/**
	 * Returns the add medical practitioner matching the UUID and group.
	 *
	 * @param uuid the add medical practitioner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddMedicalPractitioner
		fetchAddMedicalPractitionerByUuidAndGroupId(String uuid, long groupId) {

		return _addMedicalPractitionerLocalService.
			fetchAddMedicalPractitionerByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addMedicalPractitionerLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add medical practitioner with the primary key.
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner
	 * @throws PortalException if a add medical practitioner with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddMedicalPractitioner
			getAddMedicalPractitioner(long addMedicalPractitionerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addMedicalPractitionerLocalService.getAddMedicalPractitioner(
			addMedicalPractitionerId);
	}

	/**
	 * Returns the add medical practitioner matching the UUID and group.
	 *
	 * @param uuid the add medical practitioner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching add medical practitioner
	 * @throws PortalException if a matching add medical practitioner could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddMedicalPractitioner
			getAddMedicalPractitionerByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addMedicalPractitionerLocalService.
			getAddMedicalPractitionerByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the add medical practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of add medical practitioners
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AddMedicalPractitioner>
			getAddMedicalPractitioners(int start, int end) {

		return _addMedicalPractitionerLocalService.getAddMedicalPractitioners(
			start, end);
	}

	/**
	 * Returns all the add medical practitioners matching the UUID and company.
	 *
	 * @param uuid the UUID of the add medical practitioners
	 * @param companyId the primary key of the company
	 * @return the matching add medical practitioners, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AddMedicalPractitioner>
			getAddMedicalPractitionersByUuidAndCompanyId(
				String uuid, long companyId) {

		return _addMedicalPractitionerLocalService.
			getAddMedicalPractitionersByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of add medical practitioners matching the UUID and company.
	 *
	 * @param uuid the UUID of the add medical practitioners
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching add medical practitioners, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AddMedicalPractitioner>
			getAddMedicalPractitionersByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.hsra.application.service.model.
						AddMedicalPractitioner> orderByComparator) {

		return _addMedicalPractitionerLocalService.
			getAddMedicalPractitionersByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of add medical practitioners.
	 *
	 * @return the number of add medical practitioners
	 */
	@Override
	public int getAddMedicalPractitionersCount() {
		return _addMedicalPractitionerLocalService.
			getAddMedicalPractitionersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _addMedicalPractitionerLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AddMedicalPractitioner>
			getHsraById(long hsraApplicationId) {

		return _addMedicalPractitionerLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addMedicalPractitionerLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addMedicalPractitionerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addMedicalPractitionerLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add medical practitioner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddMedicalPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addMedicalPractitioner the add medical practitioner
	 * @return the add medical practitioner that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.AddMedicalPractitioner
		updateAddMedicalPractitioner(
			com.nbp.hsra.application.service.model.AddMedicalPractitioner
				addMedicalPractitioner) {

		return _addMedicalPractitionerLocalService.updateAddMedicalPractitioner(
			addMedicalPractitioner);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addMedicalPractitionerLocalService.getBasePersistence();
	}

	@Override
	public AddMedicalPractitionerLocalService getWrappedService() {
		return _addMedicalPractitionerLocalService;
	}

	@Override
	public void setWrappedService(
		AddMedicalPractitionerLocalService addMedicalPractitionerLocalService) {

		_addMedicalPractitionerLocalService =
			addMedicalPractitionerLocalService;
	}

	private AddMedicalPractitionerLocalService
		_addMedicalPractitionerLocalService;

}