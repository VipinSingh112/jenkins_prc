/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiAssesmentDetailsOfAssetException;
import com.nbp.osi.insolvency.application.form.services.model.OsiAssesmentDetailsOfAsset;
import com.nbp.osi.insolvency.application.form.services.model.OsiAssesmentDetailsOfAssetTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssesmentDetailsOfAssetImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssesmentDetailsOfAssetModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiAssesmentDetailsOfAssetPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiAssesmentDetailsOfAssetUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the osi assesment details of asset service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiAssesmentDetailsOfAssetPersistence.class)
public class OsiAssesmentDetailsOfAssetPersistenceImpl
	extends BasePersistenceImpl<OsiAssesmentDetailsOfAsset>
	implements OsiAssesmentDetailsOfAssetPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiAssesmentDetailsOfAssetUtil</code> to access the osi assesment details of asset persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiAssesmentDetailsOfAssetImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOIP_OII;
	private FinderPath _finderPathCountBygetOIP_OII;

	/**
	 * Returns the osi assesment details of asset where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiAssesmentDetailsOfAssetException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assesment details of asset
	 * @throws NoSuchOsiAssesmentDetailsOfAssetException if a matching osi assesment details of asset could not be found
	 */
	@Override
	public OsiAssesmentDetailsOfAsset findBygetOIP_OII(long osiInsolvencyId)
		throws NoSuchOsiAssesmentDetailsOfAssetException {

		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset =
			fetchBygetOIP_OII(osiInsolvencyId);

		if (osiAssesmentDetailsOfAsset == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiAssesmentDetailsOfAssetException(sb.toString());
		}

		return osiAssesmentDetailsOfAsset;
	}

	/**
	 * Returns the osi assesment details of asset where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assesment details of asset, or <code>null</code> if a matching osi assesment details of asset could not be found
	 */
	@Override
	public OsiAssesmentDetailsOfAsset fetchBygetOIP_OII(long osiInsolvencyId) {
		return fetchBygetOIP_OII(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi assesment details of asset where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi assesment details of asset, or <code>null</code> if a matching osi assesment details of asset could not be found
	 */
	@Override
	public OsiAssesmentDetailsOfAsset fetchBygetOIP_OII(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOIP_OII, finderArgs, this);
		}

		if (result instanceof OsiAssesmentDetailsOfAsset) {
			OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset =
				(OsiAssesmentDetailsOfAsset)result;

			if (osiInsolvencyId !=
					osiAssesmentDetailsOfAsset.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIASSESMENTDETAILSOFASSET_WHERE);

			sb.append(_FINDER_COLUMN_GETOIP_OII_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiAssesmentDetailsOfAsset> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOIP_OII, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiInsolvencyId};
							}

							_log.warn(
								"OsiAssesmentDetailsOfAssetPersistenceImpl.fetchBygetOIP_OII(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset =
						list.get(0);

					result = osiAssesmentDetailsOfAsset;

					cacheResult(osiAssesmentDetailsOfAsset);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (OsiAssesmentDetailsOfAsset)result;
		}
	}

	/**
	 * Removes the osi assesment details of asset where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi assesment details of asset that was removed
	 */
	@Override
	public OsiAssesmentDetailsOfAsset removeBygetOIP_OII(long osiInsolvencyId)
		throws NoSuchOsiAssesmentDetailsOfAssetException {

		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset =
			findBygetOIP_OII(osiInsolvencyId);

		return remove(osiAssesmentDetailsOfAsset);
	}

	/**
	 * Returns the number of osi assesment details of assets where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi assesment details of assets
	 */
	@Override
	public int countBygetOIP_OII(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOIP_OII;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIASSESMENTDETAILSOFASSET_WHERE);

			sb.append(_FINDER_COLUMN_GETOIP_OII_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETOIP_OII_OSIINSOLVENCYID_2 =
		"osiAssesmentDetailsOfAsset.osiInsolvencyId = ?";

	public OsiAssesmentDetailsOfAssetPersistenceImpl() {
		setModelClass(OsiAssesmentDetailsOfAsset.class);

		setModelImplClass(OsiAssesmentDetailsOfAssetImpl.class);
		setModelPKClass(long.class);

		setTable(OsiAssesmentDetailsOfAssetTable.INSTANCE);
	}

	/**
	 * Caches the osi assesment details of asset in the entity cache if it is enabled.
	 *
	 * @param osiAssesmentDetailsOfAsset the osi assesment details of asset
	 */
	@Override
	public void cacheResult(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		entityCache.putResult(
			OsiAssesmentDetailsOfAssetImpl.class,
			osiAssesmentDetailsOfAsset.getPrimaryKey(),
			osiAssesmentDetailsOfAsset);

		finderCache.putResult(
			_finderPathFetchBygetOIP_OII,
			new Object[] {osiAssesmentDetailsOfAsset.getOsiInsolvencyId()},
			osiAssesmentDetailsOfAsset);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi assesment details of assets in the entity cache if it is enabled.
	 *
	 * @param osiAssesmentDetailsOfAssets the osi assesment details of assets
	 */
	@Override
	public void cacheResult(
		List<OsiAssesmentDetailsOfAsset> osiAssesmentDetailsOfAssets) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiAssesmentDetailsOfAssets.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset :
				osiAssesmentDetailsOfAssets) {

			if (entityCache.getResult(
					OsiAssesmentDetailsOfAssetImpl.class,
					osiAssesmentDetailsOfAsset.getPrimaryKey()) == null) {

				cacheResult(osiAssesmentDetailsOfAsset);
			}
		}
	}

	/**
	 * Clears the cache for all osi assesment details of assets.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiAssesmentDetailsOfAssetImpl.class);

		finderCache.clearCache(OsiAssesmentDetailsOfAssetImpl.class);
	}

	/**
	 * Clears the cache for the osi assesment details of asset.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		entityCache.removeResult(
			OsiAssesmentDetailsOfAssetImpl.class, osiAssesmentDetailsOfAsset);
	}

	@Override
	public void clearCache(
		List<OsiAssesmentDetailsOfAsset> osiAssesmentDetailsOfAssets) {

		for (OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset :
				osiAssesmentDetailsOfAssets) {

			entityCache.removeResult(
				OsiAssesmentDetailsOfAssetImpl.class,
				osiAssesmentDetailsOfAsset);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiAssesmentDetailsOfAssetImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiAssesmentDetailsOfAssetImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiAssesmentDetailsOfAssetModelImpl
			osiAssesmentDetailsOfAssetModelImpl) {

		Object[] args = new Object[] {
			osiAssesmentDetailsOfAssetModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOIP_OII, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOIP_OII, args,
			osiAssesmentDetailsOfAssetModelImpl);
	}

	/**
	 * Creates a new osi assesment details of asset with the primary key. Does not add the osi assesment details of asset to the database.
	 *
	 * @param osiAssetDetailsId the primary key for the new osi assesment details of asset
	 * @return the new osi assesment details of asset
	 */
	@Override
	public OsiAssesmentDetailsOfAsset create(long osiAssetDetailsId) {
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset =
			new OsiAssesmentDetailsOfAssetImpl();

		osiAssesmentDetailsOfAsset.setNew(true);
		osiAssesmentDetailsOfAsset.setPrimaryKey(osiAssetDetailsId);

		osiAssesmentDetailsOfAsset.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiAssesmentDetailsOfAsset;
	}

	/**
	 * Removes the osi assesment details of asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiAssetDetailsId the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset that was removed
	 * @throws NoSuchOsiAssesmentDetailsOfAssetException if a osi assesment details of asset with the primary key could not be found
	 */
	@Override
	public OsiAssesmentDetailsOfAsset remove(long osiAssetDetailsId)
		throws NoSuchOsiAssesmentDetailsOfAssetException {

		return remove((Serializable)osiAssetDetailsId);
	}

	/**
	 * Removes the osi assesment details of asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset that was removed
	 * @throws NoSuchOsiAssesmentDetailsOfAssetException if a osi assesment details of asset with the primary key could not be found
	 */
	@Override
	public OsiAssesmentDetailsOfAsset remove(Serializable primaryKey)
		throws NoSuchOsiAssesmentDetailsOfAssetException {

		Session session = null;

		try {
			session = openSession();

			OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset =
				(OsiAssesmentDetailsOfAsset)session.get(
					OsiAssesmentDetailsOfAssetImpl.class, primaryKey);

			if (osiAssesmentDetailsOfAsset == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiAssesmentDetailsOfAssetException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiAssesmentDetailsOfAsset);
		}
		catch (NoSuchOsiAssesmentDetailsOfAssetException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected OsiAssesmentDetailsOfAsset removeImpl(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiAssesmentDetailsOfAsset)) {
				osiAssesmentDetailsOfAsset =
					(OsiAssesmentDetailsOfAsset)session.get(
						OsiAssesmentDetailsOfAssetImpl.class,
						osiAssesmentDetailsOfAsset.getPrimaryKeyObj());
			}

			if (osiAssesmentDetailsOfAsset != null) {
				session.delete(osiAssesmentDetailsOfAsset);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiAssesmentDetailsOfAsset != null) {
			clearCache(osiAssesmentDetailsOfAsset);
		}

		return osiAssesmentDetailsOfAsset;
	}

	@Override
	public OsiAssesmentDetailsOfAsset updateImpl(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		boolean isNew = osiAssesmentDetailsOfAsset.isNew();

		if (!(osiAssesmentDetailsOfAsset instanceof
				OsiAssesmentDetailsOfAssetModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiAssesmentDetailsOfAsset.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiAssesmentDetailsOfAsset);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiAssesmentDetailsOfAsset proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiAssesmentDetailsOfAsset implementation " +
					osiAssesmentDetailsOfAsset.getClass());
		}

		OsiAssesmentDetailsOfAssetModelImpl
			osiAssesmentDetailsOfAssetModelImpl =
				(OsiAssesmentDetailsOfAssetModelImpl)osiAssesmentDetailsOfAsset;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiAssesmentDetailsOfAsset.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiAssesmentDetailsOfAsset.setCreateDate(date);
			}
			else {
				osiAssesmentDetailsOfAsset.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiAssesmentDetailsOfAssetModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiAssesmentDetailsOfAsset.setModifiedDate(date);
			}
			else {
				osiAssesmentDetailsOfAsset.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiAssesmentDetailsOfAsset);
			}
			else {
				osiAssesmentDetailsOfAsset =
					(OsiAssesmentDetailsOfAsset)session.merge(
						osiAssesmentDetailsOfAsset);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiAssesmentDetailsOfAssetImpl.class,
			osiAssesmentDetailsOfAssetModelImpl, false, true);

		cacheUniqueFindersCache(osiAssesmentDetailsOfAssetModelImpl);

		if (isNew) {
			osiAssesmentDetailsOfAsset.setNew(false);
		}

		osiAssesmentDetailsOfAsset.resetOriginalValues();

		return osiAssesmentDetailsOfAsset;
	}

	/**
	 * Returns the osi assesment details of asset with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset
	 * @throws NoSuchOsiAssesmentDetailsOfAssetException if a osi assesment details of asset with the primary key could not be found
	 */
	@Override
	public OsiAssesmentDetailsOfAsset findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiAssesmentDetailsOfAssetException {

		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset =
			fetchByPrimaryKey(primaryKey);

		if (osiAssesmentDetailsOfAsset == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiAssesmentDetailsOfAssetException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiAssesmentDetailsOfAsset;
	}

	/**
	 * Returns the osi assesment details of asset with the primary key or throws a <code>NoSuchOsiAssesmentDetailsOfAssetException</code> if it could not be found.
	 *
	 * @param osiAssetDetailsId the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset
	 * @throws NoSuchOsiAssesmentDetailsOfAssetException if a osi assesment details of asset with the primary key could not be found
	 */
	@Override
	public OsiAssesmentDetailsOfAsset findByPrimaryKey(long osiAssetDetailsId)
		throws NoSuchOsiAssesmentDetailsOfAssetException {

		return findByPrimaryKey((Serializable)osiAssetDetailsId);
	}

	/**
	 * Returns the osi assesment details of asset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiAssetDetailsId the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset, or <code>null</code> if a osi assesment details of asset with the primary key could not be found
	 */
	@Override
	public OsiAssesmentDetailsOfAsset fetchByPrimaryKey(
		long osiAssetDetailsId) {

		return fetchByPrimaryKey((Serializable)osiAssetDetailsId);
	}

	/**
	 * Returns all the osi assesment details of assets.
	 *
	 * @return the osi assesment details of assets
	 */
	@Override
	public List<OsiAssesmentDetailsOfAsset> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi assesment details of assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assesment details of assets
	 * @param end the upper bound of the range of osi assesment details of assets (not inclusive)
	 * @return the range of osi assesment details of assets
	 */
	@Override
	public List<OsiAssesmentDetailsOfAsset> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi assesment details of assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assesment details of assets
	 * @param end the upper bound of the range of osi assesment details of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi assesment details of assets
	 */
	@Override
	public List<OsiAssesmentDetailsOfAsset> findAll(
		int start, int end,
		OrderByComparator<OsiAssesmentDetailsOfAsset> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi assesment details of assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assesment details of assets
	 * @param end the upper bound of the range of osi assesment details of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi assesment details of assets
	 */
	@Override
	public List<OsiAssesmentDetailsOfAsset> findAll(
		int start, int end,
		OrderByComparator<OsiAssesmentDetailsOfAsset> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<OsiAssesmentDetailsOfAsset> list = null;

		if (useFinderCache) {
			list = (List<OsiAssesmentDetailsOfAsset>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIASSESMENTDETAILSOFASSET);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIASSESMENTDETAILSOFASSET;

				sql = sql.concat(
					OsiAssesmentDetailsOfAssetModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiAssesmentDetailsOfAsset>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the osi assesment details of assets from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset :
				findAll()) {

			remove(osiAssesmentDetailsOfAsset);
		}
	}

	/**
	 * Returns the number of osi assesment details of assets.
	 *
	 * @return the number of osi assesment details of assets
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_OSIASSESMENTDETAILSOFASSET);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "osiAssetDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIASSESMENTDETAILSOFASSET;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiAssesmentDetailsOfAssetModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi assesment details of asset persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetOIP_OII = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOIP_OII",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOIP_OII = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOIP_OII",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		OsiAssesmentDetailsOfAssetUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiAssesmentDetailsOfAssetUtil.setPersistence(null);

		entityCache.removeCache(OsiAssesmentDetailsOfAssetImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIASSESMENTDETAILSOFASSET =
		"SELECT osiAssesmentDetailsOfAsset FROM OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset";

	private static final String _SQL_SELECT_OSIASSESMENTDETAILSOFASSET_WHERE =
		"SELECT osiAssesmentDetailsOfAsset FROM OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset WHERE ";

	private static final String _SQL_COUNT_OSIASSESMENTDETAILSOFASSET =
		"SELECT COUNT(osiAssesmentDetailsOfAsset) FROM OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset";

	private static final String _SQL_COUNT_OSIASSESMENTDETAILSOFASSET_WHERE =
		"SELECT COUNT(osiAssesmentDetailsOfAsset) FROM OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiAssesmentDetailsOfAsset.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiAssesmentDetailsOfAsset exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiAssesmentDetailsOfAsset exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiAssesmentDetailsOfAssetPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}