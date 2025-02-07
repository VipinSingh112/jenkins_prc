/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JADSCNoticeOfAppearanceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCNoticeOfAppearanceLocalService
 * @generated
 */
public class JADSCNoticeOfAppearanceLocalServiceWrapper
	implements JADSCNoticeOfAppearanceLocalService,
			   ServiceWrapper<JADSCNoticeOfAppearanceLocalService> {

	public JADSCNoticeOfAppearanceLocalServiceWrapper() {
		this(null);
	}

	public JADSCNoticeOfAppearanceLocalServiceWrapper(
		JADSCNoticeOfAppearanceLocalService
			jadscNoticeOfAppearanceLocalService) {

		_jadscNoticeOfAppearanceLocalService =
			jadscNoticeOfAppearanceLocalService;
	}

	/**
	 * Adds the jadsc notice of appearance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCNoticeOfAppearanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscNoticeOfAppearance the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was added
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
		addJADSCNoticeOfAppearance(
			com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
				jadscNoticeOfAppearance) {

		return _jadscNoticeOfAppearanceLocalService.addJADSCNoticeOfAppearance(
			jadscNoticeOfAppearance);
	}

	/**
	 * Creates a new jadsc notice of appearance with the primary key. Does not add the jadsc notice of appearance to the database.
	 *
	 * @param jadscNOAId the primary key for the new jadsc notice of appearance
	 * @return the new jadsc notice of appearance
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
		createJADSCNoticeOfAppearance(long jadscNOAId) {

		return _jadscNoticeOfAppearanceLocalService.
			createJADSCNoticeOfAppearance(jadscNOAId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscNoticeOfAppearanceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc notice of appearance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCNoticeOfAppearanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscNoticeOfAppearance the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was removed
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
		deleteJADSCNoticeOfAppearance(
			com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
				jadscNoticeOfAppearance) {

		return _jadscNoticeOfAppearanceLocalService.
			deleteJADSCNoticeOfAppearance(jadscNoticeOfAppearance);
	}

	/**
	 * Deletes the jadsc notice of appearance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCNoticeOfAppearanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was removed
	 * @throws PortalException if a jadsc notice of appearance with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
			deleteJADSCNoticeOfAppearance(long jadscNOAId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscNoticeOfAppearanceLocalService.
			deleteJADSCNoticeOfAppearance(jadscNOAId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscNoticeOfAppearanceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscNoticeOfAppearanceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscNoticeOfAppearanceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscNoticeOfAppearanceLocalService.dynamicQuery();
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

		return _jadscNoticeOfAppearanceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCNoticeOfAppearanceModelImpl</code>.
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

		return _jadscNoticeOfAppearanceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCNoticeOfAppearanceModelImpl</code>.
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

		return _jadscNoticeOfAppearanceLocalService.dynamicQuery(
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

		return _jadscNoticeOfAppearanceLocalService.dynamicQueryCount(
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

		return _jadscNoticeOfAppearanceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
		fetchJADSCNoticeOfAppearance(long jadscNOAId) {

		return _jadscNoticeOfAppearanceLocalService.
			fetchJADSCNoticeOfAppearance(jadscNOAId);
	}

	/**
	 * Returns the jadsc notice of appearance matching the UUID and group.
	 *
	 * @param uuid the jadsc notice of appearance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
		fetchJADSCNoticeOfAppearanceByUuidAndGroupId(
			String uuid, long groupId) {

		return _jadscNoticeOfAppearanceLocalService.
			fetchJADSCNoticeOfAppearanceByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscNoticeOfAppearanceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jadscNoticeOfAppearanceLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscNoticeOfAppearanceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc notice of appearance with the primary key.
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance
	 * @throws PortalException if a jadsc notice of appearance with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
			getJADSCNoticeOfAppearance(long jadscNOAId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscNoticeOfAppearanceLocalService.getJADSCNoticeOfAppearance(
			jadscNOAId);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
			getJADSCNoticeOfAppearanceBy_Id(long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCNoticeOfAppearanceException {

		return _jadscNoticeOfAppearanceLocalService.
			getJADSCNoticeOfAppearanceBy_Id(jadscApplicationId);
	}

	/**
	 * Returns the jadsc notice of appearance matching the UUID and group.
	 *
	 * @param uuid the jadsc notice of appearance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc notice of appearance
	 * @throws PortalException if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
			getJADSCNoticeOfAppearanceByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscNoticeOfAppearanceLocalService.
			getJADSCNoticeOfAppearanceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc notice of appearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @return the range of jadsc notice of appearances
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance>
			getJADSCNoticeOfAppearances(int start, int end) {

		return _jadscNoticeOfAppearanceLocalService.getJADSCNoticeOfAppearances(
			start, end);
	}

	/**
	 * Returns all the jadsc notice of appearances matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc notice of appearances
	 * @param companyId the primary key of the company
	 * @return the matching jadsc notice of appearances, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance>
			getJADSCNoticeOfAppearancesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _jadscNoticeOfAppearanceLocalService.
			getJADSCNoticeOfAppearancesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of jadsc notice of appearances matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc notice of appearances
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc notice of appearances, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance>
			getJADSCNoticeOfAppearancesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jadsc.application.form.service.model.
						JADSCNoticeOfAppearance> orderByComparator) {

		return _jadscNoticeOfAppearanceLocalService.
			getJADSCNoticeOfAppearancesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc notice of appearances.
	 *
	 * @return the number of jadsc notice of appearances
	 */
	@Override
	public int getJADSCNoticeOfAppearancesCount() {
		return _jadscNoticeOfAppearanceLocalService.
			getJADSCNoticeOfAppearancesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscNoticeOfAppearanceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscNoticeOfAppearanceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jadsc notice of appearance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCNoticeOfAppearanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscNoticeOfAppearance the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was updated
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
		updateJADSCNoticeOfAppearance(
			com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance
				jadscNoticeOfAppearance) {

		return _jadscNoticeOfAppearanceLocalService.
			updateJADSCNoticeOfAppearance(jadscNoticeOfAppearance);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscNoticeOfAppearanceLocalService.getBasePersistence();
	}

	@Override
	public JADSCNoticeOfAppearanceLocalService getWrappedService() {
		return _jadscNoticeOfAppearanceLocalService;
	}

	@Override
	public void setWrappedService(
		JADSCNoticeOfAppearanceLocalService
			jadscNoticeOfAppearanceLocalService) {

		_jadscNoticeOfAppearanceLocalService =
			jadscNoticeOfAppearanceLocalService;
	}

	private JADSCNoticeOfAppearanceLocalService
		_jadscNoticeOfAppearanceLocalService;

}