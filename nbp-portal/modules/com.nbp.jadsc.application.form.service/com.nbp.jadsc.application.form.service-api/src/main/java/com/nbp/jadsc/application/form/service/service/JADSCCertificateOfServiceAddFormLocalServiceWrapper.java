/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JADSCCertificateOfServiceAddFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceAddFormLocalService
 * @generated
 */
public class JADSCCertificateOfServiceAddFormLocalServiceWrapper
	implements JADSCCertificateOfServiceAddFormLocalService,
			   ServiceWrapper<JADSCCertificateOfServiceAddFormLocalService> {

	public JADSCCertificateOfServiceAddFormLocalServiceWrapper() {
		this(null);
	}

	public JADSCCertificateOfServiceAddFormLocalServiceWrapper(
		JADSCCertificateOfServiceAddFormLocalService
			jadscCertificateOfServiceAddFormLocalService) {

		_jadscCertificateOfServiceAddFormLocalService =
			jadscCertificateOfServiceAddFormLocalService;
	}

	/**
	 * Adds the jadsc certificate of service add form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceAddFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfServiceAddForm the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was added
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.
		JADSCCertificateOfServiceAddForm addJADSCCertificateOfServiceAddForm(
			com.nbp.jadsc.application.form.service.model.
				JADSCCertificateOfServiceAddForm
					jadscCertificateOfServiceAddForm) {

		return _jadscCertificateOfServiceAddFormLocalService.
			addJADSCCertificateOfServiceAddForm(
				jadscCertificateOfServiceAddForm);
	}

	/**
	 * Creates a new jadsc certificate of service add form with the primary key. Does not add the jadsc certificate of service add form to the database.
	 *
	 * @param jadscCOSId the primary key for the new jadsc certificate of service add form
	 * @return the new jadsc certificate of service add form
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.
		JADSCCertificateOfServiceAddForm createJADSCCertificateOfServiceAddForm(
			long jadscCOSId) {

		return _jadscCertificateOfServiceAddFormLocalService.
			createJADSCCertificateOfServiceAddForm(jadscCOSId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceAddFormLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the jadsc certificate of service add form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceAddFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfServiceAddForm the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was removed
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.
		JADSCCertificateOfServiceAddForm deleteJADSCCertificateOfServiceAddForm(
			com.nbp.jadsc.application.form.service.model.
				JADSCCertificateOfServiceAddForm
					jadscCertificateOfServiceAddForm) {

		return _jadscCertificateOfServiceAddFormLocalService.
			deleteJADSCCertificateOfServiceAddForm(
				jadscCertificateOfServiceAddForm);
	}

	/**
	 * Deletes the jadsc certificate of service add form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceAddFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was removed
	 * @throws PortalException if a jadsc certificate of service add form with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.
		JADSCCertificateOfServiceAddForm deleteJADSCCertificateOfServiceAddForm(
				long jadscCOSId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceAddFormLocalService.
			deleteJADSCCertificateOfServiceAddForm(jadscCOSId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceAddFormLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscCertificateOfServiceAddFormLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscCertificateOfServiceAddFormLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscCertificateOfServiceAddFormLocalService.dynamicQuery();
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

		return _jadscCertificateOfServiceAddFormLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceAddFormModelImpl</code>.
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

		return _jadscCertificateOfServiceAddFormLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceAddFormModelImpl</code>.
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

		return _jadscCertificateOfServiceAddFormLocalService.dynamicQuery(
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

		return _jadscCertificateOfServiceAddFormLocalService.dynamicQueryCount(
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

		return _jadscCertificateOfServiceAddFormLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.
		JADSCCertificateOfServiceAddForm fetchJADSCCertificateOfServiceAddForm(
			long jadscCOSId) {

		return _jadscCertificateOfServiceAddFormLocalService.
			fetchJADSCCertificateOfServiceAddForm(jadscCOSId);
	}

	/**
	 * Returns the jadsc certificate of service add form matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of service add form's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.
		JADSCCertificateOfServiceAddForm
			fetchJADSCCertificateOfServiceAddFormByUuidAndGroupId(
				String uuid, long groupId) {

		return _jadscCertificateOfServiceAddFormLocalService.
			fetchJADSCCertificateOfServiceAddFormByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscCertificateOfServiceAddFormLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jadscCertificateOfServiceAddFormLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscCertificateOfServiceAddFormLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc certificate of service add form with the primary key.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form
	 * @throws PortalException if a jadsc certificate of service add form with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.
		JADSCCertificateOfServiceAddForm getJADSCCertificateOfServiceAddForm(
				long jadscCOSId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceAddFormLocalService.
			getJADSCCertificateOfServiceAddForm(jadscCOSId);
	}

	/**
	 * Returns the jadsc certificate of service add form matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of service add form's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of service add form
	 * @throws PortalException if a matching jadsc certificate of service add form could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.
		JADSCCertificateOfServiceAddForm
				getJADSCCertificateOfServiceAddFormByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceAddFormLocalService.
			getJADSCCertificateOfServiceAddFormByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc certificate of service add forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of jadsc certificate of service add forms
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.
			JADSCCertificateOfServiceAddForm>
				getJADSCCertificateOfServiceAddForms(int start, int end) {

		return _jadscCertificateOfServiceAddFormLocalService.
			getJADSCCertificateOfServiceAddForms(start, end);
	}

	/**
	 * Returns all the jadsc certificate of service add forms matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of service add forms
	 * @param companyId the primary key of the company
	 * @return the matching jadsc certificate of service add forms, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.
			JADSCCertificateOfServiceAddForm>
				getJADSCCertificateOfServiceAddFormsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _jadscCertificateOfServiceAddFormLocalService.
			getJADSCCertificateOfServiceAddFormsByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of jadsc certificate of service add forms matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of service add forms
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc certificate of service add forms, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.
			JADSCCertificateOfServiceAddForm>
				getJADSCCertificateOfServiceAddFormsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.jadsc.application.form.service.model.
							JADSCCertificateOfServiceAddForm>
								orderByComparator) {

		return _jadscCertificateOfServiceAddFormLocalService.
			getJADSCCertificateOfServiceAddFormsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc certificate of service add forms.
	 *
	 * @return the number of jadsc certificate of service add forms
	 */
	@Override
	public int getJADSCCertificateOfServiceAddFormsCount() {
		return _jadscCertificateOfServiceAddFormLocalService.
			getJADSCCertificateOfServiceAddFormsCount();
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.
			JADSCCertificateOfServiceAddForm> getJADSCDataListBy_Id(
				long jadscApplicationId) {

		return _jadscCertificateOfServiceAddFormLocalService.
			getJADSCDataListBy_Id(jadscApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscCertificateOfServiceAddFormLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfServiceAddFormLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jadsc certificate of service add form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfServiceAddFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfServiceAddForm the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was updated
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.
		JADSCCertificateOfServiceAddForm updateJADSCCertificateOfServiceAddForm(
			com.nbp.jadsc.application.form.service.model.
				JADSCCertificateOfServiceAddForm
					jadscCertificateOfServiceAddForm) {

		return _jadscCertificateOfServiceAddFormLocalService.
			updateJADSCCertificateOfServiceAddForm(
				jadscCertificateOfServiceAddForm);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscCertificateOfServiceAddFormLocalService.
			getBasePersistence();
	}

	@Override
	public JADSCCertificateOfServiceAddFormLocalService getWrappedService() {
		return _jadscCertificateOfServiceAddFormLocalService;
	}

	@Override
	public void setWrappedService(
		JADSCCertificateOfServiceAddFormLocalService
			jadscCertificateOfServiceAddFormLocalService) {

		_jadscCertificateOfServiceAddFormLocalService =
			jadscCertificateOfServiceAddFormLocalService;
	}

	private JADSCCertificateOfServiceAddFormLocalService
		_jadscCertificateOfServiceAddFormLocalService;

}