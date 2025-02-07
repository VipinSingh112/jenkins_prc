/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JADSCChecklistAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistAddLocalService
 * @generated
 */
public class JADSCChecklistAddLocalServiceWrapper
	implements JADSCChecklistAddLocalService,
			   ServiceWrapper<JADSCChecklistAddLocalService> {

	public JADSCChecklistAddLocalServiceWrapper() {
		this(null);
	}

	public JADSCChecklistAddLocalServiceWrapper(
		JADSCChecklistAddLocalService jadscChecklistAddLocalService) {

		_jadscChecklistAddLocalService = jadscChecklistAddLocalService;
	}

	/**
	 * Adds the jadsc checklist add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklistAdd the jadsc checklist add
	 * @return the jadsc checklist add that was added
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
		addJADSCChecklistAdd(
			com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
				jadscChecklistAdd) {

		return _jadscChecklistAddLocalService.addJADSCChecklistAdd(
			jadscChecklistAdd);
	}

	/**
	 * Creates a new jadsc checklist add with the primary key. Does not add the jadsc checklist add to the database.
	 *
	 * @param jADSCChecklistAddId the primary key for the new jadsc checklist add
	 * @return the new jadsc checklist add
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
		createJADSCChecklistAdd(long jADSCChecklistAddId) {

		return _jadscChecklistAddLocalService.createJADSCChecklistAdd(
			jADSCChecklistAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc checklist add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklistAdd the jadsc checklist add
	 * @return the jadsc checklist add that was removed
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
		deleteJADSCChecklistAdd(
			com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
				jadscChecklistAdd) {

		return _jadscChecklistAddLocalService.deleteJADSCChecklistAdd(
			jadscChecklistAdd);
	}

	/**
	 * Deletes the jadsc checklist add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add that was removed
	 * @throws PortalException if a jadsc checklist add with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
			deleteJADSCChecklistAdd(long jADSCChecklistAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistAddLocalService.deleteJADSCChecklistAdd(
			jADSCChecklistAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscChecklistAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscChecklistAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscChecklistAddLocalService.dynamicQuery();
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

		return _jadscChecklistAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistAddModelImpl</code>.
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

		return _jadscChecklistAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistAddModelImpl</code>.
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

		return _jadscChecklistAddLocalService.dynamicQuery(
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

		return _jadscChecklistAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _jadscChecklistAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
		fetchJADSCChecklistAdd(long jADSCChecklistAddId) {

		return _jadscChecklistAddLocalService.fetchJADSCChecklistAdd(
			jADSCChecklistAddId);
	}

	/**
	 * Returns the jadsc checklist add matching the UUID and group.
	 *
	 * @param uuid the jadsc checklist add's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
		fetchJADSCChecklistAddByUuidAndGroupId(String uuid, long groupId) {

		return _jadscChecklistAddLocalService.
			fetchJADSCChecklistAddByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscChecklistAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd>
			getAppIdJADSC(long jadscApplicationId) {

		return _jadscChecklistAddLocalService.getAppIdJADSC(jadscApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jadscChecklistAddLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscChecklistAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd>
			getJadsc_byAppId(long jadscApplicationId) {

		return _jadscChecklistAddLocalService.getJadsc_byAppId(
			jadscApplicationId);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
			getJadscByAppId(long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCChecklistAddException {

		return _jadscChecklistAddLocalService.getJadscByAppId(
			jadscApplicationId);
	}

	/**
	 * Returns the jadsc checklist add with the primary key.
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add
	 * @throws PortalException if a jadsc checklist add with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
			getJADSCChecklistAdd(long jADSCChecklistAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistAddLocalService.getJADSCChecklistAdd(
			jADSCChecklistAddId);
	}

	/**
	 * Returns the jadsc checklist add matching the UUID and group.
	 *
	 * @param uuid the jadsc checklist add's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc checklist add
	 * @throws PortalException if a matching jadsc checklist add could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
			getJADSCChecklistAddByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistAddLocalService.
			getJADSCChecklistAddByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc checklist adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of jadsc checklist adds
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd>
			getJADSCChecklistAdds(int start, int end) {

		return _jadscChecklistAddLocalService.getJADSCChecklistAdds(start, end);
	}

	/**
	 * Returns all the jadsc checklist adds matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc checklist adds
	 * @param companyId the primary key of the company
	 * @return the matching jadsc checklist adds, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd>
			getJADSCChecklistAddsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _jadscChecklistAddLocalService.
			getJADSCChecklistAddsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of jadsc checklist adds matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc checklist adds
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc checklist adds, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd>
			getJADSCChecklistAddsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jadsc.application.form.service.model.
						JADSCChecklistAdd> orderByComparator) {

		return _jadscChecklistAddLocalService.
			getJADSCChecklistAddsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc checklist adds.
	 *
	 * @return the number of jadsc checklist adds
	 */
	@Override
	public int getJADSCChecklistAddsCount() {
		return _jadscChecklistAddLocalService.getJADSCChecklistAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscChecklistAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscChecklistAddLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the jadsc checklist add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklistAdd the jadsc checklist add
	 * @return the jadsc checklist add that was updated
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
		updateJADSCChecklistAdd(
			com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd
				jadscChecklistAdd) {

		return _jadscChecklistAddLocalService.updateJADSCChecklistAdd(
			jadscChecklistAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscChecklistAddLocalService.getBasePersistence();
	}

	@Override
	public JADSCChecklistAddLocalService getWrappedService() {
		return _jadscChecklistAddLocalService;
	}

	@Override
	public void setWrappedService(
		JADSCChecklistAddLocalService jadscChecklistAddLocalService) {

		_jadscChecklistAddLocalService = jadscChecklistAddLocalService;
	}

	private JADSCChecklistAddLocalService _jadscChecklistAddLocalService;

}