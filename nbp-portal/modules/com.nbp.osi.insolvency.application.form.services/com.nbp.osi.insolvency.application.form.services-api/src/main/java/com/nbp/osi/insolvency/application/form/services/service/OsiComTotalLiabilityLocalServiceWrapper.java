/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiComTotalLiabilityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiComTotalLiabilityLocalService
 * @generated
 */
public class OsiComTotalLiabilityLocalServiceWrapper
	implements OsiComTotalLiabilityLocalService,
			   ServiceWrapper<OsiComTotalLiabilityLocalService> {

	public OsiComTotalLiabilityLocalServiceWrapper() {
		this(null);
	}

	public OsiComTotalLiabilityLocalServiceWrapper(
		OsiComTotalLiabilityLocalService osiComTotalLiabilityLocalService) {

		_osiComTotalLiabilityLocalService = osiComTotalLiabilityLocalService;
	}

	/**
	 * Adds the osi com total liability to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComTotalLiability the osi com total liability
	 * @return the osi com total liability that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComTotalLiability addOsiComTotalLiability(
				com.nbp.osi.insolvency.application.form.services.model.
					OsiComTotalLiability osiComTotalLiability) {

		return _osiComTotalLiabilityLocalService.addOsiComTotalLiability(
			osiComTotalLiability);
	}

	/**
	 * Creates a new osi com total liability with the primary key. Does not add the osi com total liability to the database.
	 *
	 * @param osiComTotalLiabilityId the primary key for the new osi com total liability
	 * @return the new osi com total liability
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComTotalLiability createOsiComTotalLiability(
				long osiComTotalLiabilityId) {

		return _osiComTotalLiabilityLocalService.createOsiComTotalLiability(
			osiComTotalLiabilityId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiComTotalLiabilityLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi com total liability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability that was removed
	 * @throws PortalException if a osi com total liability with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComTotalLiability deleteOsiComTotalLiability(
					long osiComTotalLiabilityId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiComTotalLiabilityLocalService.deleteOsiComTotalLiability(
			osiComTotalLiabilityId);
	}

	/**
	 * Deletes the osi com total liability from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComTotalLiability the osi com total liability
	 * @return the osi com total liability that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComTotalLiability deleteOsiComTotalLiability(
				com.nbp.osi.insolvency.application.form.services.model.
					OsiComTotalLiability osiComTotalLiability) {

		return _osiComTotalLiabilityLocalService.deleteOsiComTotalLiability(
			osiComTotalLiability);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiComTotalLiabilityLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiComTotalLiabilityLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiComTotalLiabilityLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiComTotalLiabilityLocalService.dynamicQuery();
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

		return _osiComTotalLiabilityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiComTotalLiabilityModelImpl</code>.
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

		return _osiComTotalLiabilityLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiComTotalLiabilityModelImpl</code>.
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

		return _osiComTotalLiabilityLocalService.dynamicQuery(
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

		return _osiComTotalLiabilityLocalService.dynamicQueryCount(
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

		return _osiComTotalLiabilityLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComTotalLiability fetchOsiComTotalLiability(
				long osiComTotalLiabilityId) {

		return _osiComTotalLiabilityLocalService.fetchOsiComTotalLiability(
			osiComTotalLiabilityId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiComTotalLiabilityLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiComTotalLiabilityLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiComTotalLiabilityLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComTotalLiability getOsiById(long osiInsolvencyId)
				throws com.nbp.osi.insolvency.application.form.services.
					exception.NoSuchOsiComTotalLiabilityException {

		return _osiComTotalLiabilityLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the osi com total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiComTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com total liabilities
	 * @param end the upper bound of the range of osi com total liabilities (not inclusive)
	 * @return the range of osi com total liabilities
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiComTotalLiability> getOsiComTotalLiabilities(
				int start, int end) {

		return _osiComTotalLiabilityLocalService.getOsiComTotalLiabilities(
			start, end);
	}

	/**
	 * Returns the number of osi com total liabilities.
	 *
	 * @return the number of osi com total liabilities
	 */
	@Override
	public int getOsiComTotalLiabilitiesCount() {
		return _osiComTotalLiabilityLocalService.
			getOsiComTotalLiabilitiesCount();
	}

	/**
	 * Returns the osi com total liability with the primary key.
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability
	 * @throws PortalException if a osi com total liability with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComTotalLiability getOsiComTotalLiability(
					long osiComTotalLiabilityId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiComTotalLiabilityLocalService.getOsiComTotalLiability(
			osiComTotalLiabilityId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiComTotalLiabilityLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi com total liability in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiComTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComTotalLiability the osi com total liability
	 * @return the osi com total liability that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			OsiComTotalLiability updateOsiComTotalLiability(
				com.nbp.osi.insolvency.application.form.services.model.
					OsiComTotalLiability osiComTotalLiability) {

		return _osiComTotalLiabilityLocalService.updateOsiComTotalLiability(
			osiComTotalLiability);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiComTotalLiabilityLocalService.getBasePersistence();
	}

	@Override
	public OsiComTotalLiabilityLocalService getWrappedService() {
		return _osiComTotalLiabilityLocalService;
	}

	@Override
	public void setWrappedService(
		OsiComTotalLiabilityLocalService osiComTotalLiabilityLocalService) {

		_osiComTotalLiabilityLocalService = osiComTotalLiabilityLocalService;
	}

	private OsiComTotalLiabilityLocalService _osiComTotalLiabilityLocalService;

}