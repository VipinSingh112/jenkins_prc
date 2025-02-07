/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaManufacturerInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaManufacturerInfoLocalService
 * @generated
 */
public class PharmaManufacturerInfoLocalServiceWrapper
	implements PharmaManufacturerInfoLocalService,
			   ServiceWrapper<PharmaManufacturerInfoLocalService> {

	public PharmaManufacturerInfoLocalServiceWrapper() {
		this(null);
	}

	public PharmaManufacturerInfoLocalServiceWrapper(
		PharmaManufacturerInfoLocalService pharmaManufacturerInfoLocalService) {

		_pharmaManufacturerInfoLocalService =
			pharmaManufacturerInfoLocalService;
	}

	/**
	 * Adds the pharma manufacturer info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaManufacturerInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaManufacturerInfo the pharma manufacturer info
	 * @return the pharma manufacturer info that was added
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaManufacturerInfo addPharmaManufacturerInfo(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaManufacturerInfo pharmaManufacturerInfo) {

		return _pharmaManufacturerInfoLocalService.addPharmaManufacturerInfo(
			pharmaManufacturerInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaManufacturerInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma manufacturer info with the primary key. Does not add the pharma manufacturer info to the database.
	 *
	 * @param pharmaManufacturerInfoId the primary key for the new pharma manufacturer info
	 * @return the new pharma manufacturer info
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaManufacturerInfo createPharmaManufacturerInfo(
				long pharmaManufacturerInfoId) {

		return _pharmaManufacturerInfoLocalService.createPharmaManufacturerInfo(
			pharmaManufacturerInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaManufacturerInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma manufacturer info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaManufacturerInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaManufacturerInfoId the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info that was removed
	 * @throws PortalException if a pharma manufacturer info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaManufacturerInfo deletePharmaManufacturerInfo(
					long pharmaManufacturerInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaManufacturerInfoLocalService.deletePharmaManufacturerInfo(
			pharmaManufacturerInfoId);
	}

	/**
	 * Deletes the pharma manufacturer info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaManufacturerInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaManufacturerInfo the pharma manufacturer info
	 * @return the pharma manufacturer info that was removed
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaManufacturerInfo deletePharmaManufacturerInfo(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaManufacturerInfo pharmaManufacturerInfo) {

		return _pharmaManufacturerInfoLocalService.deletePharmaManufacturerInfo(
			pharmaManufacturerInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaManufacturerInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaManufacturerInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaManufacturerInfoLocalService.dynamicQuery();
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

		return _pharmaManufacturerInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaManufacturerInfoModelImpl</code>.
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

		return _pharmaManufacturerInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaManufacturerInfoModelImpl</code>.
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

		return _pharmaManufacturerInfoLocalService.dynamicQuery(
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

		return _pharmaManufacturerInfoLocalService.dynamicQueryCount(
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

		return _pharmaManufacturerInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaManufacturerInfo fetchPharmaManufacturerInfo(
				long pharmaManufacturerInfoId) {

		return _pharmaManufacturerInfoLocalService.fetchPharmaManufacturerInfo(
			pharmaManufacturerInfoId);
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaManufacturerInfo findBygetPharmaByAppId(long applicationId)
				throws com.nbp.pharmaceutical.application.form.service.
					exception.NoSuchPharmaManufacturerInfoException {

		return _pharmaManufacturerInfoLocalService.findBygetPharmaByAppId(
			applicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaManufacturerInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaManufacturerInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaManufacturerInfoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaManufacturerInfo> getPA_MI_PAI(long applicaitonnId) {

		return _pharmaManufacturerInfoLocalService.getPA_MI_PAI(applicaitonnId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaManufacturerInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the pharma manufacturer info with the primary key.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info
	 * @throws PortalException if a pharma manufacturer info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaManufacturerInfo getPharmaManufacturerInfo(
					long pharmaManufacturerInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaManufacturerInfoLocalService.getPharmaManufacturerInfo(
			pharmaManufacturerInfoId);
	}

	/**
	 * Returns a range of all the pharma manufacturer infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @return the range of pharma manufacturer infos
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaManufacturerInfo> getPharmaManufacturerInfos(
				int start, int end) {

		return _pharmaManufacturerInfoLocalService.getPharmaManufacturerInfos(
			start, end);
	}

	/**
	 * Returns the number of pharma manufacturer infos.
	 *
	 * @return the number of pharma manufacturer infos
	 */
	@Override
	public int getPharmaManufacturerInfosCount() {
		return _pharmaManufacturerInfoLocalService.
			getPharmaManufacturerInfosCount();
	}

	/**
	 * Updates the pharma manufacturer info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaManufacturerInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaManufacturerInfo the pharma manufacturer info
	 * @return the pharma manufacturer info that was updated
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.
			PharmaManufacturerInfo updatePharmaManufacturerInfo(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaManufacturerInfo pharmaManufacturerInfo) {

		return _pharmaManufacturerInfoLocalService.updatePharmaManufacturerInfo(
			pharmaManufacturerInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaManufacturerInfoLocalService.getBasePersistence();
	}

	@Override
	public PharmaManufacturerInfoLocalService getWrappedService() {
		return _pharmaManufacturerInfoLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaManufacturerInfoLocalService pharmaManufacturerInfoLocalService) {

		_pharmaManufacturerInfoLocalService =
			pharmaManufacturerInfoLocalService;
	}

	private PharmaManufacturerInfoLocalService
		_pharmaManufacturerInfoLocalService;

}