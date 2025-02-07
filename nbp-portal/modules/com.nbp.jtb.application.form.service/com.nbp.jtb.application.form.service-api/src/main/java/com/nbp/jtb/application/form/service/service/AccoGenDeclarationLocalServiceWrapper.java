/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccoGenDeclarationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoGenDeclarationLocalService
 * @generated
 */
public class AccoGenDeclarationLocalServiceWrapper
	implements AccoGenDeclarationLocalService,
			   ServiceWrapper<AccoGenDeclarationLocalService> {

	public AccoGenDeclarationLocalServiceWrapper() {
		this(null);
	}

	public AccoGenDeclarationLocalServiceWrapper(
		AccoGenDeclarationLocalService accoGenDeclarationLocalService) {

		_accoGenDeclarationLocalService = accoGenDeclarationLocalService;
	}

	/**
	 * Adds the acco gen declaration to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclaration the acco gen declaration
	 * @return the acco gen declaration that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoGenDeclaration
		addAccoGenDeclaration(
			com.nbp.jtb.application.form.service.model.AccoGenDeclaration
				accoGenDeclaration) {

		return _accoGenDeclarationLocalService.addAccoGenDeclaration(
			accoGenDeclaration);
	}

	/**
	 * Creates a new acco gen declaration with the primary key. Does not add the acco gen declaration to the database.
	 *
	 * @param accoGenDeclarationId the primary key for the new acco gen declaration
	 * @return the new acco gen declaration
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoGenDeclaration
		createAccoGenDeclaration(long accoGenDeclarationId) {

		return _accoGenDeclarationLocalService.createAccoGenDeclaration(
			accoGenDeclarationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoGenDeclarationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acco gen declaration from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclaration the acco gen declaration
	 * @return the acco gen declaration that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoGenDeclaration
		deleteAccoGenDeclaration(
			com.nbp.jtb.application.form.service.model.AccoGenDeclaration
				accoGenDeclaration) {

		return _accoGenDeclarationLocalService.deleteAccoGenDeclaration(
			accoGenDeclaration);
	}

	/**
	 * Deletes the acco gen declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration that was removed
	 * @throws PortalException if a acco gen declaration with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoGenDeclaration
			deleteAccoGenDeclaration(long accoGenDeclarationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoGenDeclarationLocalService.deleteAccoGenDeclaration(
			accoGenDeclarationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoGenDeclarationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accoGenDeclarationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accoGenDeclarationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accoGenDeclarationLocalService.dynamicQuery();
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

		return _accoGenDeclarationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoGenDeclarationModelImpl</code>.
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

		return _accoGenDeclarationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoGenDeclarationModelImpl</code>.
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

		return _accoGenDeclarationLocalService.dynamicQuery(
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

		return _accoGenDeclarationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accoGenDeclarationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoGenDeclaration
		fetchAccoGenDeclaration(long accoGenDeclarationId) {

		return _accoGenDeclarationLocalService.fetchAccoGenDeclaration(
			accoGenDeclarationId);
	}

	/**
	 * Returns the acco gen declaration matching the UUID and group.
	 *
	 * @param uuid the acco gen declaration's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoGenDeclaration
		fetchAccoGenDeclarationByUuidAndGroupId(String uuid, long groupId) {

		return _accoGenDeclarationLocalService.
			fetchAccoGenDeclarationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acco gen declaration with the primary key.
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration
	 * @throws PortalException if a acco gen declaration with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoGenDeclaration
			getAccoGenDeclaration(long accoGenDeclarationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoGenDeclarationLocalService.getAccoGenDeclaration(
			accoGenDeclarationId);
	}

	/**
	 * Returns the acco gen declaration matching the UUID and group.
	 *
	 * @param uuid the acco gen declaration's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco gen declaration
	 * @throws PortalException if a matching acco gen declaration could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoGenDeclaration
			getAccoGenDeclarationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoGenDeclarationLocalService.
			getAccoGenDeclarationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acco gen declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @return the range of acco gen declarations
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoGenDeclaration>
			getAccoGenDeclarations(int start, int end) {

		return _accoGenDeclarationLocalService.getAccoGenDeclarations(
			start, end);
	}

	/**
	 * Returns all the acco gen declarations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco gen declarations
	 * @param companyId the primary key of the company
	 * @return the matching acco gen declarations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoGenDeclaration>
			getAccoGenDeclarationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accoGenDeclarationLocalService.
			getAccoGenDeclarationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acco gen declarations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco gen declarations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acco gen declarations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoGenDeclaration>
			getAccoGenDeclarationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jtb.application.form.service.model.
						AccoGenDeclaration> orderByComparator) {

		return _accoGenDeclarationLocalService.
			getAccoGenDeclarationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acco gen declarations.
	 *
	 * @return the number of acco gen declarations
	 */
	@Override
	public int getAccoGenDeclarationsCount() {
		return _accoGenDeclarationLocalService.getAccoGenDeclarationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accoGenDeclarationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accoGenDeclarationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accoGenDeclarationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoGenDeclaration
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoGenDeclarationException {

		return _accoGenDeclarationLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoGenDeclarationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoGenDeclarationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acco gen declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclaration the acco gen declaration
	 * @return the acco gen declaration that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoGenDeclaration
		updateAccoGenDeclaration(
			com.nbp.jtb.application.form.service.model.AccoGenDeclaration
				accoGenDeclaration) {

		return _accoGenDeclarationLocalService.updateAccoGenDeclaration(
			accoGenDeclaration);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accoGenDeclarationLocalService.getBasePersistence();
	}

	@Override
	public AccoGenDeclarationLocalService getWrappedService() {
		return _accoGenDeclarationLocalService;
	}

	@Override
	public void setWrappedService(
		AccoGenDeclarationLocalService accoGenDeclarationLocalService) {

		_accoGenDeclarationLocalService = accoGenDeclarationLocalService;
	}

	private AccoGenDeclarationLocalService _accoGenDeclarationLocalService;

}