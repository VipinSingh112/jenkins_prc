/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionCarRentalLicenceException;
import com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence;
import com.nbp.jtb.application.form.service.model.AttractionCarRentalLicenceTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionCarRentalLicenceImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionCarRentalLicenceModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionCarRentalLicencePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionCarRentalLicenceUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the attraction car rental licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionCarRentalLicencePersistence.class)
public class AttractionCarRentalLicencePersistenceImpl
	extends BasePersistenceImpl<AttractionCarRentalLicence>
	implements AttractionCarRentalLicencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionCarRentalLicenceUtil</code> to access the attraction car rental licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionCarRentalLicenceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the attraction car rental licence where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionCarRentalLicenceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rental licence
	 * @throws NoSuchAttractionCarRentalLicenceException if a matching attraction car rental licence could not be found
	 */
	@Override
	public AttractionCarRentalLicence findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentalLicenceException {

		AttractionCarRentalLicence attractionCarRentalLicence =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionCarRentalLicence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionCarRentalLicenceException(sb.toString());
		}

		return attractionCarRentalLicence;
	}

	/**
	 * Returns the attraction car rental licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rental licence, or <code>null</code> if a matching attraction car rental licence could not be found
	 */
	@Override
	public AttractionCarRentalLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction car rental licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction car rental licence, or <code>null</code> if a matching attraction car rental licence could not be found
	 */
	@Override
	public AttractionCarRentalLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AttractionCarRentalLicence) {
			AttractionCarRentalLicence attractionCarRentalLicence =
				(AttractionCarRentalLicence)result;

			if (jtbApplicationId !=
					attractionCarRentalLicence.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONCARRENTALLICENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionCarRentalLicence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_ByApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"AttractionCarRentalLicencePersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionCarRentalLicence attractionCarRentalLicence =
						list.get(0);

					result = attractionCarRentalLicence;

					cacheResult(attractionCarRentalLicence);
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
			return (AttractionCarRentalLicence)result;
		}
	}

	/**
	 * Removes the attraction car rental licence where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction car rental licence that was removed
	 */
	@Override
	public AttractionCarRentalLicence removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentalLicenceException {

		AttractionCarRentalLicence attractionCarRentalLicence =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionCarRentalLicence);
	}

	/**
	 * Returns the number of attraction car rental licences where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction car rental licences
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONCARRENTALLICENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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

	private static final String
		_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2 =
			"attractionCarRentalLicence.jtbApplicationId = ?";

	public AttractionCarRentalLicencePersistenceImpl() {
		setModelClass(AttractionCarRentalLicence.class);

		setModelImplClass(AttractionCarRentalLicenceImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionCarRentalLicenceTable.INSTANCE);
	}

	/**
	 * Caches the attraction car rental licence in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentalLicence the attraction car rental licence
	 */
	@Override
	public void cacheResult(
		AttractionCarRentalLicence attractionCarRentalLicence) {

		entityCache.putResult(
			AttractionCarRentalLicenceImpl.class,
			attractionCarRentalLicence.getPrimaryKey(),
			attractionCarRentalLicence);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionCarRentalLicence.getJtbApplicationId()},
			attractionCarRentalLicence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction car rental licences in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentalLicences the attraction car rental licences
	 */
	@Override
	public void cacheResult(
		List<AttractionCarRentalLicence> attractionCarRentalLicences) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionCarRentalLicences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionCarRentalLicence attractionCarRentalLicence :
				attractionCarRentalLicences) {

			if (entityCache.getResult(
					AttractionCarRentalLicenceImpl.class,
					attractionCarRentalLicence.getPrimaryKey()) == null) {

				cacheResult(attractionCarRentalLicence);
			}
		}
	}

	/**
	 * Clears the cache for all attraction car rental licences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionCarRentalLicenceImpl.class);

		finderCache.clearCache(AttractionCarRentalLicenceImpl.class);
	}

	/**
	 * Clears the cache for the attraction car rental licence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AttractionCarRentalLicence attractionCarRentalLicence) {

		entityCache.removeResult(
			AttractionCarRentalLicenceImpl.class, attractionCarRentalLicence);
	}

	@Override
	public void clearCache(
		List<AttractionCarRentalLicence> attractionCarRentalLicences) {

		for (AttractionCarRentalLicence attractionCarRentalLicence :
				attractionCarRentalLicences) {

			entityCache.removeResult(
				AttractionCarRentalLicenceImpl.class,
				attractionCarRentalLicence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionCarRentalLicenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionCarRentalLicenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionCarRentalLicenceModelImpl
			attractionCarRentalLicenceModelImpl) {

		Object[] args = new Object[] {
			attractionCarRentalLicenceModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionCarRentalLicenceModelImpl);
	}

	/**
	 * Creates a new attraction car rental licence with the primary key. Does not add the attraction car rental licence to the database.
	 *
	 * @param attractionCarRentalLicId the primary key for the new attraction car rental licence
	 * @return the new attraction car rental licence
	 */
	@Override
	public AttractionCarRentalLicence create(long attractionCarRentalLicId) {
		AttractionCarRentalLicence attractionCarRentalLicence =
			new AttractionCarRentalLicenceImpl();

		attractionCarRentalLicence.setNew(true);
		attractionCarRentalLicence.setPrimaryKey(attractionCarRentalLicId);

		attractionCarRentalLicence.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return attractionCarRentalLicence;
	}

	/**
	 * Removes the attraction car rental licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionCarRentalLicId the primary key of the attraction car rental licence
	 * @return the attraction car rental licence that was removed
	 * @throws NoSuchAttractionCarRentalLicenceException if a attraction car rental licence with the primary key could not be found
	 */
	@Override
	public AttractionCarRentalLicence remove(long attractionCarRentalLicId)
		throws NoSuchAttractionCarRentalLicenceException {

		return remove((Serializable)attractionCarRentalLicId);
	}

	/**
	 * Removes the attraction car rental licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction car rental licence
	 * @return the attraction car rental licence that was removed
	 * @throws NoSuchAttractionCarRentalLicenceException if a attraction car rental licence with the primary key could not be found
	 */
	@Override
	public AttractionCarRentalLicence remove(Serializable primaryKey)
		throws NoSuchAttractionCarRentalLicenceException {

		Session session = null;

		try {
			session = openSession();

			AttractionCarRentalLicence attractionCarRentalLicence =
				(AttractionCarRentalLicence)session.get(
					AttractionCarRentalLicenceImpl.class, primaryKey);

			if (attractionCarRentalLicence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionCarRentalLicenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionCarRentalLicence);
		}
		catch (NoSuchAttractionCarRentalLicenceException
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
	protected AttractionCarRentalLicence removeImpl(
		AttractionCarRentalLicence attractionCarRentalLicence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionCarRentalLicence)) {
				attractionCarRentalLicence =
					(AttractionCarRentalLicence)session.get(
						AttractionCarRentalLicenceImpl.class,
						attractionCarRentalLicence.getPrimaryKeyObj());
			}

			if (attractionCarRentalLicence != null) {
				session.delete(attractionCarRentalLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionCarRentalLicence != null) {
			clearCache(attractionCarRentalLicence);
		}

		return attractionCarRentalLicence;
	}

	@Override
	public AttractionCarRentalLicence updateImpl(
		AttractionCarRentalLicence attractionCarRentalLicence) {

		boolean isNew = attractionCarRentalLicence.isNew();

		if (!(attractionCarRentalLicence instanceof
				AttractionCarRentalLicenceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionCarRentalLicence.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionCarRentalLicence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionCarRentalLicence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionCarRentalLicence implementation " +
					attractionCarRentalLicence.getClass());
		}

		AttractionCarRentalLicenceModelImpl
			attractionCarRentalLicenceModelImpl =
				(AttractionCarRentalLicenceModelImpl)attractionCarRentalLicence;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionCarRentalLicence.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionCarRentalLicence.setCreateDate(date);
			}
			else {
				attractionCarRentalLicence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionCarRentalLicenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionCarRentalLicence.setModifiedDate(date);
			}
			else {
				attractionCarRentalLicence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionCarRentalLicence);
			}
			else {
				attractionCarRentalLicence =
					(AttractionCarRentalLicence)session.merge(
						attractionCarRentalLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionCarRentalLicenceImpl.class,
			attractionCarRentalLicenceModelImpl, false, true);

		cacheUniqueFindersCache(attractionCarRentalLicenceModelImpl);

		if (isNew) {
			attractionCarRentalLicence.setNew(false);
		}

		attractionCarRentalLicence.resetOriginalValues();

		return attractionCarRentalLicence;
	}

	/**
	 * Returns the attraction car rental licence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction car rental licence
	 * @return the attraction car rental licence
	 * @throws NoSuchAttractionCarRentalLicenceException if a attraction car rental licence with the primary key could not be found
	 */
	@Override
	public AttractionCarRentalLicence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionCarRentalLicenceException {

		AttractionCarRentalLicence attractionCarRentalLicence =
			fetchByPrimaryKey(primaryKey);

		if (attractionCarRentalLicence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionCarRentalLicenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionCarRentalLicence;
	}

	/**
	 * Returns the attraction car rental licence with the primary key or throws a <code>NoSuchAttractionCarRentalLicenceException</code> if it could not be found.
	 *
	 * @param attractionCarRentalLicId the primary key of the attraction car rental licence
	 * @return the attraction car rental licence
	 * @throws NoSuchAttractionCarRentalLicenceException if a attraction car rental licence with the primary key could not be found
	 */
	@Override
	public AttractionCarRentalLicence findByPrimaryKey(
			long attractionCarRentalLicId)
		throws NoSuchAttractionCarRentalLicenceException {

		return findByPrimaryKey((Serializable)attractionCarRentalLicId);
	}

	/**
	 * Returns the attraction car rental licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionCarRentalLicId the primary key of the attraction car rental licence
	 * @return the attraction car rental licence, or <code>null</code> if a attraction car rental licence with the primary key could not be found
	 */
	@Override
	public AttractionCarRentalLicence fetchByPrimaryKey(
		long attractionCarRentalLicId) {

		return fetchByPrimaryKey((Serializable)attractionCarRentalLicId);
	}

	/**
	 * Returns all the attraction car rental licences.
	 *
	 * @return the attraction car rental licences
	 */
	@Override
	public List<AttractionCarRentalLicence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction car rental licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rental licences
	 * @param end the upper bound of the range of attraction car rental licences (not inclusive)
	 * @return the range of attraction car rental licences
	 */
	@Override
	public List<AttractionCarRentalLicence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction car rental licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rental licences
	 * @param end the upper bound of the range of attraction car rental licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction car rental licences
	 */
	@Override
	public List<AttractionCarRentalLicence> findAll(
		int start, int end,
		OrderByComparator<AttractionCarRentalLicence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction car rental licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rental licences
	 * @param end the upper bound of the range of attraction car rental licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction car rental licences
	 */
	@Override
	public List<AttractionCarRentalLicence> findAll(
		int start, int end,
		OrderByComparator<AttractionCarRentalLicence> orderByComparator,
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

		List<AttractionCarRentalLicence> list = null;

		if (useFinderCache) {
			list = (List<AttractionCarRentalLicence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONCARRENTALLICENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONCARRENTALLICENCE;

				sql = sql.concat(
					AttractionCarRentalLicenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionCarRentalLicence>)QueryUtil.list(
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
	 * Removes all the attraction car rental licences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionCarRentalLicence attractionCarRentalLicence :
				findAll()) {

			remove(attractionCarRentalLicence);
		}
	}

	/**
	 * Returns the number of attraction car rental licences.
	 *
	 * @return the number of attraction car rental licences
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
					_SQL_COUNT_ATTRACTIONCARRENTALLICENCE);

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
		return "attractionCarRentalLicId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONCARRENTALLICENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionCarRentalLicenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction car rental licence persistence.
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

		_finderPathFetchBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		AttractionCarRentalLicenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionCarRentalLicenceUtil.setPersistence(null);

		entityCache.removeCache(AttractionCarRentalLicenceImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ATTRACTIONCARRENTALLICENCE =
		"SELECT attractionCarRentalLicence FROM AttractionCarRentalLicence attractionCarRentalLicence";

	private static final String _SQL_SELECT_ATTRACTIONCARRENTALLICENCE_WHERE =
		"SELECT attractionCarRentalLicence FROM AttractionCarRentalLicence attractionCarRentalLicence WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONCARRENTALLICENCE =
		"SELECT COUNT(attractionCarRentalLicence) FROM AttractionCarRentalLicence attractionCarRentalLicence";

	private static final String _SQL_COUNT_ATTRACTIONCARRENTALLICENCE_WHERE =
		"SELECT COUNT(attractionCarRentalLicence) FROM AttractionCarRentalLicence attractionCarRentalLicence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionCarRentalLicence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionCarRentalLicence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionCarRentalLicence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionCarRentalLicencePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}