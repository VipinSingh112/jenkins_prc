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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiIndiTotalDetailOfAssetsException;
import com.nbp.osi.insolvency.application.form.services.model.OsiIndiTotalDetailOfAssets;
import com.nbp.osi.insolvency.application.form.services.model.OsiIndiTotalDetailOfAssetsTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiIndiTotalDetailOfAssetsImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiIndiTotalDetailOfAssetsModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiIndiTotalDetailOfAssetsPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiIndiTotalDetailOfAssetsUtil;
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
 * The persistence implementation for the osi indi total detail of assets service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiIndiTotalDetailOfAssetsPersistence.class)
public class OsiIndiTotalDetailOfAssetsPersistenceImpl
	extends BasePersistenceImpl<OsiIndiTotalDetailOfAssets>
	implements OsiIndiTotalDetailOfAssetsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiIndiTotalDetailOfAssetsUtil</code> to access the osi indi total detail of assets persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiIndiTotalDetailOfAssetsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns the osi indi total detail of assets where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiIndiTotalDetailOfAssetsException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi indi total detail of assets
	 * @throws NoSuchOsiIndiTotalDetailOfAssetsException if a matching osi indi total detail of assets could not be found
	 */
	@Override
	public OsiIndiTotalDetailOfAssets findBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiIndiTotalDetailOfAssetsException {

		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets =
			fetchBygetOsiById(osiInsolvencyId);

		if (osiIndiTotalDetailOfAssets == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiIndiTotalDetailOfAssetsException(sb.toString());
		}

		return osiIndiTotalDetailOfAssets;
	}

	/**
	 * Returns the osi indi total detail of assets where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi indi total detail of assets, or <code>null</code> if a matching osi indi total detail of assets could not be found
	 */
	@Override
	public OsiIndiTotalDetailOfAssets fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi indi total detail of assets where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi indi total detail of assets, or <code>null</code> if a matching osi indi total detail of assets could not be found
	 */
	@Override
	public OsiIndiTotalDetailOfAssets fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiById, finderArgs, this);
		}

		if (result instanceof OsiIndiTotalDetailOfAssets) {
			OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets =
				(OsiIndiTotalDetailOfAssets)result;

			if (osiInsolvencyId !=
					osiIndiTotalDetailOfAssets.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINDITOTALDETAILOFASSETS_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiIndiTotalDetailOfAssets> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiById, finderArgs, list);
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
								"OsiIndiTotalDetailOfAssetsPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets =
						list.get(0);

					result = osiIndiTotalDetailOfAssets;

					cacheResult(osiIndiTotalDetailOfAssets);
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
			return (OsiIndiTotalDetailOfAssets)result;
		}
	}

	/**
	 * Removes the osi indi total detail of assets where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi indi total detail of assets that was removed
	 */
	@Override
	public OsiIndiTotalDetailOfAssets removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiIndiTotalDetailOfAssetsException {

		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets =
			findBygetOsiById(osiInsolvencyId);

		return remove(osiIndiTotalDetailOfAssets);
	}

	/**
	 * Returns the number of osi indi total detail of assetses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi indi total detail of assetses
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINDITOTALDETAILOFASSETS_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"osiIndiTotalDetailOfAssets.osiInsolvencyId = ?";

	public OsiIndiTotalDetailOfAssetsPersistenceImpl() {
		setModelClass(OsiIndiTotalDetailOfAssets.class);

		setModelImplClass(OsiIndiTotalDetailOfAssetsImpl.class);
		setModelPKClass(long.class);

		setTable(OsiIndiTotalDetailOfAssetsTable.INSTANCE);
	}

	/**
	 * Caches the osi indi total detail of assets in the entity cache if it is enabled.
	 *
	 * @param osiIndiTotalDetailOfAssets the osi indi total detail of assets
	 */
	@Override
	public void cacheResult(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		entityCache.putResult(
			OsiIndiTotalDetailOfAssetsImpl.class,
			osiIndiTotalDetailOfAssets.getPrimaryKey(),
			osiIndiTotalDetailOfAssets);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {osiIndiTotalDetailOfAssets.getOsiInsolvencyId()},
			osiIndiTotalDetailOfAssets);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi indi total detail of assetses in the entity cache if it is enabled.
	 *
	 * @param osiIndiTotalDetailOfAssetses the osi indi total detail of assetses
	 */
	@Override
	public void cacheResult(
		List<OsiIndiTotalDetailOfAssets> osiIndiTotalDetailOfAssetses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiIndiTotalDetailOfAssetses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets :
				osiIndiTotalDetailOfAssetses) {

			if (entityCache.getResult(
					OsiIndiTotalDetailOfAssetsImpl.class,
					osiIndiTotalDetailOfAssets.getPrimaryKey()) == null) {

				cacheResult(osiIndiTotalDetailOfAssets);
			}
		}
	}

	/**
	 * Clears the cache for all osi indi total detail of assetses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiIndiTotalDetailOfAssetsImpl.class);

		finderCache.clearCache(OsiIndiTotalDetailOfAssetsImpl.class);
	}

	/**
	 * Clears the cache for the osi indi total detail of assets.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		entityCache.removeResult(
			OsiIndiTotalDetailOfAssetsImpl.class, osiIndiTotalDetailOfAssets);
	}

	@Override
	public void clearCache(
		List<OsiIndiTotalDetailOfAssets> osiIndiTotalDetailOfAssetses) {

		for (OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets :
				osiIndiTotalDetailOfAssetses) {

			entityCache.removeResult(
				OsiIndiTotalDetailOfAssetsImpl.class,
				osiIndiTotalDetailOfAssets);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiIndiTotalDetailOfAssetsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiIndiTotalDetailOfAssetsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiIndiTotalDetailOfAssetsModelImpl
			osiIndiTotalDetailOfAssetsModelImpl) {

		Object[] args = new Object[] {
			osiIndiTotalDetailOfAssetsModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args,
			osiIndiTotalDetailOfAssetsModelImpl);
	}

	/**
	 * Creates a new osi indi total detail of assets with the primary key. Does not add the osi indi total detail of assets to the database.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key for the new osi indi total detail of assets
	 * @return the new osi indi total detail of assets
	 */
	@Override
	public OsiIndiTotalDetailOfAssets create(
		long osiIndiTotalDetailOfAssetsId) {

		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets =
			new OsiIndiTotalDetailOfAssetsImpl();

		osiIndiTotalDetailOfAssets.setNew(true);
		osiIndiTotalDetailOfAssets.setPrimaryKey(osiIndiTotalDetailOfAssetsId);

		osiIndiTotalDetailOfAssets.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiIndiTotalDetailOfAssets;
	}

	/**
	 * Removes the osi indi total detail of assets with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets that was removed
	 * @throws NoSuchOsiIndiTotalDetailOfAssetsException if a osi indi total detail of assets with the primary key could not be found
	 */
	@Override
	public OsiIndiTotalDetailOfAssets remove(long osiIndiTotalDetailOfAssetsId)
		throws NoSuchOsiIndiTotalDetailOfAssetsException {

		return remove((Serializable)osiIndiTotalDetailOfAssetsId);
	}

	/**
	 * Removes the osi indi total detail of assets with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets that was removed
	 * @throws NoSuchOsiIndiTotalDetailOfAssetsException if a osi indi total detail of assets with the primary key could not be found
	 */
	@Override
	public OsiIndiTotalDetailOfAssets remove(Serializable primaryKey)
		throws NoSuchOsiIndiTotalDetailOfAssetsException {

		Session session = null;

		try {
			session = openSession();

			OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets =
				(OsiIndiTotalDetailOfAssets)session.get(
					OsiIndiTotalDetailOfAssetsImpl.class, primaryKey);

			if (osiIndiTotalDetailOfAssets == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiIndiTotalDetailOfAssetsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiIndiTotalDetailOfAssets);
		}
		catch (NoSuchOsiIndiTotalDetailOfAssetsException
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
	protected OsiIndiTotalDetailOfAssets removeImpl(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiIndiTotalDetailOfAssets)) {
				osiIndiTotalDetailOfAssets =
					(OsiIndiTotalDetailOfAssets)session.get(
						OsiIndiTotalDetailOfAssetsImpl.class,
						osiIndiTotalDetailOfAssets.getPrimaryKeyObj());
			}

			if (osiIndiTotalDetailOfAssets != null) {
				session.delete(osiIndiTotalDetailOfAssets);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiIndiTotalDetailOfAssets != null) {
			clearCache(osiIndiTotalDetailOfAssets);
		}

		return osiIndiTotalDetailOfAssets;
	}

	@Override
	public OsiIndiTotalDetailOfAssets updateImpl(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		boolean isNew = osiIndiTotalDetailOfAssets.isNew();

		if (!(osiIndiTotalDetailOfAssets instanceof
				OsiIndiTotalDetailOfAssetsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiIndiTotalDetailOfAssets.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiIndiTotalDetailOfAssets);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiIndiTotalDetailOfAssets proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiIndiTotalDetailOfAssets implementation " +
					osiIndiTotalDetailOfAssets.getClass());
		}

		OsiIndiTotalDetailOfAssetsModelImpl
			osiIndiTotalDetailOfAssetsModelImpl =
				(OsiIndiTotalDetailOfAssetsModelImpl)osiIndiTotalDetailOfAssets;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiIndiTotalDetailOfAssets.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiIndiTotalDetailOfAssets.setCreateDate(date);
			}
			else {
				osiIndiTotalDetailOfAssets.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiIndiTotalDetailOfAssetsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiIndiTotalDetailOfAssets.setModifiedDate(date);
			}
			else {
				osiIndiTotalDetailOfAssets.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiIndiTotalDetailOfAssets);
			}
			else {
				osiIndiTotalDetailOfAssets =
					(OsiIndiTotalDetailOfAssets)session.merge(
						osiIndiTotalDetailOfAssets);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiIndiTotalDetailOfAssetsImpl.class,
			osiIndiTotalDetailOfAssetsModelImpl, false, true);

		cacheUniqueFindersCache(osiIndiTotalDetailOfAssetsModelImpl);

		if (isNew) {
			osiIndiTotalDetailOfAssets.setNew(false);
		}

		osiIndiTotalDetailOfAssets.resetOriginalValues();

		return osiIndiTotalDetailOfAssets;
	}

	/**
	 * Returns the osi indi total detail of assets with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets
	 * @throws NoSuchOsiIndiTotalDetailOfAssetsException if a osi indi total detail of assets with the primary key could not be found
	 */
	@Override
	public OsiIndiTotalDetailOfAssets findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiIndiTotalDetailOfAssetsException {

		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets =
			fetchByPrimaryKey(primaryKey);

		if (osiIndiTotalDetailOfAssets == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiIndiTotalDetailOfAssetsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiIndiTotalDetailOfAssets;
	}

	/**
	 * Returns the osi indi total detail of assets with the primary key or throws a <code>NoSuchOsiIndiTotalDetailOfAssetsException</code> if it could not be found.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets
	 * @throws NoSuchOsiIndiTotalDetailOfAssetsException if a osi indi total detail of assets with the primary key could not be found
	 */
	@Override
	public OsiIndiTotalDetailOfAssets findByPrimaryKey(
			long osiIndiTotalDetailOfAssetsId)
		throws NoSuchOsiIndiTotalDetailOfAssetsException {

		return findByPrimaryKey((Serializable)osiIndiTotalDetailOfAssetsId);
	}

	/**
	 * Returns the osi indi total detail of assets with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets, or <code>null</code> if a osi indi total detail of assets with the primary key could not be found
	 */
	@Override
	public OsiIndiTotalDetailOfAssets fetchByPrimaryKey(
		long osiIndiTotalDetailOfAssetsId) {

		return fetchByPrimaryKey((Serializable)osiIndiTotalDetailOfAssetsId);
	}

	/**
	 * Returns all the osi indi total detail of assetses.
	 *
	 * @return the osi indi total detail of assetses
	 */
	@Override
	public List<OsiIndiTotalDetailOfAssets> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi indi total detail of assetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiIndiTotalDetailOfAssetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi indi total detail of assetses
	 * @param end the upper bound of the range of osi indi total detail of assetses (not inclusive)
	 * @return the range of osi indi total detail of assetses
	 */
	@Override
	public List<OsiIndiTotalDetailOfAssets> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi indi total detail of assetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiIndiTotalDetailOfAssetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi indi total detail of assetses
	 * @param end the upper bound of the range of osi indi total detail of assetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi indi total detail of assetses
	 */
	@Override
	public List<OsiIndiTotalDetailOfAssets> findAll(
		int start, int end,
		OrderByComparator<OsiIndiTotalDetailOfAssets> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi indi total detail of assetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiIndiTotalDetailOfAssetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi indi total detail of assetses
	 * @param end the upper bound of the range of osi indi total detail of assetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi indi total detail of assetses
	 */
	@Override
	public List<OsiIndiTotalDetailOfAssets> findAll(
		int start, int end,
		OrderByComparator<OsiIndiTotalDetailOfAssets> orderByComparator,
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

		List<OsiIndiTotalDetailOfAssets> list = null;

		if (useFinderCache) {
			list = (List<OsiIndiTotalDetailOfAssets>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIINDITOTALDETAILOFASSETS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIINDITOTALDETAILOFASSETS;

				sql = sql.concat(
					OsiIndiTotalDetailOfAssetsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiIndiTotalDetailOfAssets>)QueryUtil.list(
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
	 * Removes all the osi indi total detail of assetses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets :
				findAll()) {

			remove(osiIndiTotalDetailOfAssets);
		}
	}

	/**
	 * Returns the number of osi indi total detail of assetses.
	 *
	 * @return the number of osi indi total detail of assetses
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
					_SQL_COUNT_OSIINDITOTALDETAILOFASSETS);

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
		return "osiIndiTotalDetailOfAssetsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIINDITOTALDETAILOFASSETS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiIndiTotalDetailOfAssetsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi indi total detail of assets persistence.
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

		_finderPathFetchBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		OsiIndiTotalDetailOfAssetsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiIndiTotalDetailOfAssetsUtil.setPersistence(null);

		entityCache.removeCache(OsiIndiTotalDetailOfAssetsImpl.class.getName());
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

	private static final String _SQL_SELECT_OSIINDITOTALDETAILOFASSETS =
		"SELECT osiIndiTotalDetailOfAssets FROM OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets";

	private static final String _SQL_SELECT_OSIINDITOTALDETAILOFASSETS_WHERE =
		"SELECT osiIndiTotalDetailOfAssets FROM OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets WHERE ";

	private static final String _SQL_COUNT_OSIINDITOTALDETAILOFASSETS =
		"SELECT COUNT(osiIndiTotalDetailOfAssets) FROM OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets";

	private static final String _SQL_COUNT_OSIINDITOTALDETAILOFASSETS_WHERE =
		"SELECT COUNT(osiIndiTotalDetailOfAssets) FROM OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiIndiTotalDetailOfAssets.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiIndiTotalDetailOfAssets exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiIndiTotalDetailOfAssets exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiIndiTotalDetailOfAssetsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}