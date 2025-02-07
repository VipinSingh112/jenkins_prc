/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccCerBodyPersonnelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyPersonnelLocalService
 * @generated
 */
public class AccCerBodyPersonnelLocalServiceWrapper
	implements AccCerBodyPersonnelLocalService,
			   ServiceWrapper<AccCerBodyPersonnelLocalService> {

	public AccCerBodyPersonnelLocalServiceWrapper() {
		this(null);
	}

	public AccCerBodyPersonnelLocalServiceWrapper(
		AccCerBodyPersonnelLocalService accCerBodyPersonnelLocalService) {

		_accCerBodyPersonnelLocalService = accCerBodyPersonnelLocalService;
	}

	/**
	 * Adds the acc cer body personnel to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyPersonnelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyPersonnel the acc cer body personnel
	 * @return the acc cer body personnel that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
		addAccCerBodyPersonnel(
			com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
				accCerBodyPersonnel) {

		return _accCerBodyPersonnelLocalService.addAccCerBodyPersonnel(
			accCerBodyPersonnel);
	}

	/**
	 * Creates a new acc cer body personnel with the primary key. Does not add the acc cer body personnel to the database.
	 *
	 * @param accCerBodyPersonnelId the primary key for the new acc cer body personnel
	 * @return the new acc cer body personnel
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
		createAccCerBodyPersonnel(long accCerBodyPersonnelId) {

		return _accCerBodyPersonnelLocalService.createAccCerBodyPersonnel(
			accCerBodyPersonnelId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyPersonnelLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc cer body personnel from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyPersonnelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyPersonnel the acc cer body personnel
	 * @return the acc cer body personnel that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
		deleteAccCerBodyPersonnel(
			com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
				accCerBodyPersonnel) {

		return _accCerBodyPersonnelLocalService.deleteAccCerBodyPersonnel(
			accCerBodyPersonnel);
	}

	/**
	 * Deletes the acc cer body personnel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyPersonnelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyPersonnelId the primary key of the acc cer body personnel
	 * @return the acc cer body personnel that was removed
	 * @throws PortalException if a acc cer body personnel with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
			deleteAccCerBodyPersonnel(long accCerBodyPersonnelId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyPersonnelLocalService.deleteAccCerBodyPersonnel(
			accCerBodyPersonnelId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyPersonnelLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accCerBodyPersonnelLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accCerBodyPersonnelLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accCerBodyPersonnelLocalService.dynamicQuery();
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

		return _accCerBodyPersonnelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyPersonnelModelImpl</code>.
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

		return _accCerBodyPersonnelLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyPersonnelModelImpl</code>.
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

		return _accCerBodyPersonnelLocalService.dynamicQuery(
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

		return _accCerBodyPersonnelLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accCerBodyPersonnelLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
		fetchAccCerBodyPersonnel(long accCerBodyPersonnelId) {

		return _accCerBodyPersonnelLocalService.fetchAccCerBodyPersonnel(
			accCerBodyPersonnelId);
	}

	/**
	 * Returns the acc cer body personnel matching the UUID and group.
	 *
	 * @param uuid the acc cer body personnel's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
		fetchAccCerBodyPersonnelByUuidAndGroupId(String uuid, long groupId) {

		return _accCerBodyPersonnelLocalService.
			fetchAccCerBodyPersonnelByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc cer body personnel with the primary key.
	 *
	 * @param accCerBodyPersonnelId the primary key of the acc cer body personnel
	 * @return the acc cer body personnel
	 * @throws PortalException if a acc cer body personnel with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
			getAccCerBodyPersonnel(long accCerBodyPersonnelId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyPersonnelLocalService.getAccCerBodyPersonnel(
			accCerBodyPersonnelId);
	}

	/**
	 * Returns the acc cer body personnel matching the UUID and group.
	 *
	 * @param uuid the acc cer body personnel's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body personnel
	 * @throws PortalException if a matching acc cer body personnel could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
			getAccCerBodyPersonnelByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyPersonnelLocalService.
			getAccCerBodyPersonnelByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc cer body personnels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @return the range of acc cer body personnels
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel>
			getAccCerBodyPersonnels(int start, int end) {

		return _accCerBodyPersonnelLocalService.getAccCerBodyPersonnels(
			start, end);
	}

	/**
	 * Returns all the acc cer body personnels matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body personnels
	 * @param companyId the primary key of the company
	 * @return the matching acc cer body personnels, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel>
			getAccCerBodyPersonnelsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accCerBodyPersonnelLocalService.
			getAccCerBodyPersonnelsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc cer body personnels matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body personnels
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc cer body personnels, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel>
			getAccCerBodyPersonnelsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccCerBodyPersonnel> orderByComparator) {

		return _accCerBodyPersonnelLocalService.
			getAccCerBodyPersonnelsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc cer body personnels.
	 *
	 * @return the number of acc cer body personnels
	 */
	@Override
	public int getAccCerBodyPersonnelsCount() {
		return _accCerBodyPersonnelLocalService.getAccCerBodyPersonnelsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accCerBodyPersonnelLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accCerBodyPersonnelLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accCerBodyPersonnelLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return _accCerBodyPersonnelLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyPersonnelLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyPersonnelLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc cer body personnel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyPersonnelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyPersonnel the acc cer body personnel
	 * @return the acc cer body personnel that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
		updateAccCerBodyPersonnel(
			com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel
				accCerBodyPersonnel) {

		return _accCerBodyPersonnelLocalService.updateAccCerBodyPersonnel(
			accCerBodyPersonnel);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accCerBodyPersonnelLocalService.getBasePersistence();
	}

	@Override
	public AccCerBodyPersonnelLocalService getWrappedService() {
		return _accCerBodyPersonnelLocalService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyPersonnelLocalService accCerBodyPersonnelLocalService) {

		_accCerBodyPersonnelLocalService = accCerBodyPersonnelLocalService;
	}

	private AccCerBodyPersonnelLocalService _accCerBodyPersonnelLocalService;

}