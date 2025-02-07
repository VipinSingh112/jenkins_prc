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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionWaterGenDeclareException;
import com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare;
import com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclareTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionWaterGenDeclareImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionWaterGenDeclareModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterGenDeclarePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterGenDeclareUtil;
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
 * The persistence implementation for the attraction water gen declare service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionWaterGenDeclarePersistence.class)
public class AttractionWaterGenDeclarePersistenceImpl
	extends BasePersistenceImpl<AttractionWaterGenDeclare>
	implements AttractionWaterGenDeclarePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionWaterGenDeclareUtil</code> to access the attraction water gen declare persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionWaterGenDeclareImpl.class.getName();

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
	 * Returns the attraction water gen declare where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterGenDeclareException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water gen declare
	 * @throws NoSuchAttractionWaterGenDeclareException if a matching attraction water gen declare could not be found
	 */
	@Override
	public AttractionWaterGenDeclare findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterGenDeclareException {

		AttractionWaterGenDeclare attractionWaterGenDeclare =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionWaterGenDeclare == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionWaterGenDeclareException(sb.toString());
		}

		return attractionWaterGenDeclare;
	}

	/**
	 * Returns the attraction water gen declare where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water gen declare, or <code>null</code> if a matching attraction water gen declare could not be found
	 */
	@Override
	public AttractionWaterGenDeclare fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction water gen declare where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water gen declare, or <code>null</code> if a matching attraction water gen declare could not be found
	 */
	@Override
	public AttractionWaterGenDeclare fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AttractionWaterGenDeclare) {
			AttractionWaterGenDeclare attractionWaterGenDeclare =
				(AttractionWaterGenDeclare)result;

			if (jtbApplicationId !=
					attractionWaterGenDeclare.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONWATERGENDECLARE_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionWaterGenDeclare> list = query.list();

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
								"AttractionWaterGenDeclarePersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionWaterGenDeclare attractionWaterGenDeclare =
						list.get(0);

					result = attractionWaterGenDeclare;

					cacheResult(attractionWaterGenDeclare);
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
			return (AttractionWaterGenDeclare)result;
		}
	}

	/**
	 * Removes the attraction water gen declare where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water gen declare that was removed
	 */
	@Override
	public AttractionWaterGenDeclare removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterGenDeclareException {

		AttractionWaterGenDeclare attractionWaterGenDeclare =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionWaterGenDeclare);
	}

	/**
	 * Returns the number of attraction water gen declares where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water gen declares
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONWATERGENDECLARE_WHERE);

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
			"attractionWaterGenDeclare.jtbApplicationId = ?";

	public AttractionWaterGenDeclarePersistenceImpl() {
		setModelClass(AttractionWaterGenDeclare.class);

		setModelImplClass(AttractionWaterGenDeclareImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionWaterGenDeclareTable.INSTANCE);
	}

	/**
	 * Caches the attraction water gen declare in the entity cache if it is enabled.
	 *
	 * @param attractionWaterGenDeclare the attraction water gen declare
	 */
	@Override
	public void cacheResult(
		AttractionWaterGenDeclare attractionWaterGenDeclare) {

		entityCache.putResult(
			AttractionWaterGenDeclareImpl.class,
			attractionWaterGenDeclare.getPrimaryKey(),
			attractionWaterGenDeclare);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionWaterGenDeclare.getJtbApplicationId()},
			attractionWaterGenDeclare);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction water gen declares in the entity cache if it is enabled.
	 *
	 * @param attractionWaterGenDeclares the attraction water gen declares
	 */
	@Override
	public void cacheResult(
		List<AttractionWaterGenDeclare> attractionWaterGenDeclares) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionWaterGenDeclares.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionWaterGenDeclare attractionWaterGenDeclare :
				attractionWaterGenDeclares) {

			if (entityCache.getResult(
					AttractionWaterGenDeclareImpl.class,
					attractionWaterGenDeclare.getPrimaryKey()) == null) {

				cacheResult(attractionWaterGenDeclare);
			}
		}
	}

	/**
	 * Clears the cache for all attraction water gen declares.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionWaterGenDeclareImpl.class);

		finderCache.clearCache(AttractionWaterGenDeclareImpl.class);
	}

	/**
	 * Clears the cache for the attraction water gen declare.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AttractionWaterGenDeclare attractionWaterGenDeclare) {

		entityCache.removeResult(
			AttractionWaterGenDeclareImpl.class, attractionWaterGenDeclare);
	}

	@Override
	public void clearCache(
		List<AttractionWaterGenDeclare> attractionWaterGenDeclares) {

		for (AttractionWaterGenDeclare attractionWaterGenDeclare :
				attractionWaterGenDeclares) {

			entityCache.removeResult(
				AttractionWaterGenDeclareImpl.class, attractionWaterGenDeclare);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionWaterGenDeclareImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionWaterGenDeclareImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionWaterGenDeclareModelImpl attractionWaterGenDeclareModelImpl) {

		Object[] args = new Object[] {
			attractionWaterGenDeclareModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionWaterGenDeclareModelImpl);
	}

	/**
	 * Creates a new attraction water gen declare with the primary key. Does not add the attraction water gen declare to the database.
	 *
	 * @param attractionWaterGenDeclareId the primary key for the new attraction water gen declare
	 * @return the new attraction water gen declare
	 */
	@Override
	public AttractionWaterGenDeclare create(long attractionWaterGenDeclareId) {
		AttractionWaterGenDeclare attractionWaterGenDeclare =
			new AttractionWaterGenDeclareImpl();

		attractionWaterGenDeclare.setNew(true);
		attractionWaterGenDeclare.setPrimaryKey(attractionWaterGenDeclareId);

		attractionWaterGenDeclare.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return attractionWaterGenDeclare;
	}

	/**
	 * Removes the attraction water gen declare with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterGenDeclareId the primary key of the attraction water gen declare
	 * @return the attraction water gen declare that was removed
	 * @throws NoSuchAttractionWaterGenDeclareException if a attraction water gen declare with the primary key could not be found
	 */
	@Override
	public AttractionWaterGenDeclare remove(long attractionWaterGenDeclareId)
		throws NoSuchAttractionWaterGenDeclareException {

		return remove((Serializable)attractionWaterGenDeclareId);
	}

	/**
	 * Removes the attraction water gen declare with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction water gen declare
	 * @return the attraction water gen declare that was removed
	 * @throws NoSuchAttractionWaterGenDeclareException if a attraction water gen declare with the primary key could not be found
	 */
	@Override
	public AttractionWaterGenDeclare remove(Serializable primaryKey)
		throws NoSuchAttractionWaterGenDeclareException {

		Session session = null;

		try {
			session = openSession();

			AttractionWaterGenDeclare attractionWaterGenDeclare =
				(AttractionWaterGenDeclare)session.get(
					AttractionWaterGenDeclareImpl.class, primaryKey);

			if (attractionWaterGenDeclare == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionWaterGenDeclareException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionWaterGenDeclare);
		}
		catch (NoSuchAttractionWaterGenDeclareException noSuchEntityException) {
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
	protected AttractionWaterGenDeclare removeImpl(
		AttractionWaterGenDeclare attractionWaterGenDeclare) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionWaterGenDeclare)) {
				attractionWaterGenDeclare =
					(AttractionWaterGenDeclare)session.get(
						AttractionWaterGenDeclareImpl.class,
						attractionWaterGenDeclare.getPrimaryKeyObj());
			}

			if (attractionWaterGenDeclare != null) {
				session.delete(attractionWaterGenDeclare);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionWaterGenDeclare != null) {
			clearCache(attractionWaterGenDeclare);
		}

		return attractionWaterGenDeclare;
	}

	@Override
	public AttractionWaterGenDeclare updateImpl(
		AttractionWaterGenDeclare attractionWaterGenDeclare) {

		boolean isNew = attractionWaterGenDeclare.isNew();

		if (!(attractionWaterGenDeclare instanceof
				AttractionWaterGenDeclareModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionWaterGenDeclare.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionWaterGenDeclare);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionWaterGenDeclare proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionWaterGenDeclare implementation " +
					attractionWaterGenDeclare.getClass());
		}

		AttractionWaterGenDeclareModelImpl attractionWaterGenDeclareModelImpl =
			(AttractionWaterGenDeclareModelImpl)attractionWaterGenDeclare;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionWaterGenDeclare.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionWaterGenDeclare.setCreateDate(date);
			}
			else {
				attractionWaterGenDeclare.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionWaterGenDeclareModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionWaterGenDeclare.setModifiedDate(date);
			}
			else {
				attractionWaterGenDeclare.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionWaterGenDeclare);
			}
			else {
				attractionWaterGenDeclare =
					(AttractionWaterGenDeclare)session.merge(
						attractionWaterGenDeclare);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionWaterGenDeclareImpl.class,
			attractionWaterGenDeclareModelImpl, false, true);

		cacheUniqueFindersCache(attractionWaterGenDeclareModelImpl);

		if (isNew) {
			attractionWaterGenDeclare.setNew(false);
		}

		attractionWaterGenDeclare.resetOriginalValues();

		return attractionWaterGenDeclare;
	}

	/**
	 * Returns the attraction water gen declare with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction water gen declare
	 * @return the attraction water gen declare
	 * @throws NoSuchAttractionWaterGenDeclareException if a attraction water gen declare with the primary key could not be found
	 */
	@Override
	public AttractionWaterGenDeclare findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionWaterGenDeclareException {

		AttractionWaterGenDeclare attractionWaterGenDeclare = fetchByPrimaryKey(
			primaryKey);

		if (attractionWaterGenDeclare == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionWaterGenDeclareException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionWaterGenDeclare;
	}

	/**
	 * Returns the attraction water gen declare with the primary key or throws a <code>NoSuchAttractionWaterGenDeclareException</code> if it could not be found.
	 *
	 * @param attractionWaterGenDeclareId the primary key of the attraction water gen declare
	 * @return the attraction water gen declare
	 * @throws NoSuchAttractionWaterGenDeclareException if a attraction water gen declare with the primary key could not be found
	 */
	@Override
	public AttractionWaterGenDeclare findByPrimaryKey(
			long attractionWaterGenDeclareId)
		throws NoSuchAttractionWaterGenDeclareException {

		return findByPrimaryKey((Serializable)attractionWaterGenDeclareId);
	}

	/**
	 * Returns the attraction water gen declare with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterGenDeclareId the primary key of the attraction water gen declare
	 * @return the attraction water gen declare, or <code>null</code> if a attraction water gen declare with the primary key could not be found
	 */
	@Override
	public AttractionWaterGenDeclare fetchByPrimaryKey(
		long attractionWaterGenDeclareId) {

		return fetchByPrimaryKey((Serializable)attractionWaterGenDeclareId);
	}

	/**
	 * Returns all the attraction water gen declares.
	 *
	 * @return the attraction water gen declares
	 */
	@Override
	public List<AttractionWaterGenDeclare> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction water gen declares.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterGenDeclareModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water gen declares
	 * @param end the upper bound of the range of attraction water gen declares (not inclusive)
	 * @return the range of attraction water gen declares
	 */
	@Override
	public List<AttractionWaterGenDeclare> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction water gen declares.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterGenDeclareModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water gen declares
	 * @param end the upper bound of the range of attraction water gen declares (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water gen declares
	 */
	@Override
	public List<AttractionWaterGenDeclare> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterGenDeclare> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction water gen declares.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterGenDeclareModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water gen declares
	 * @param end the upper bound of the range of attraction water gen declares (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water gen declares
	 */
	@Override
	public List<AttractionWaterGenDeclare> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterGenDeclare> orderByComparator,
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

		List<AttractionWaterGenDeclare> list = null;

		if (useFinderCache) {
			list = (List<AttractionWaterGenDeclare>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONWATERGENDECLARE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONWATERGENDECLARE;

				sql = sql.concat(
					AttractionWaterGenDeclareModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionWaterGenDeclare>)QueryUtil.list(
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
	 * Removes all the attraction water gen declares from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionWaterGenDeclare attractionWaterGenDeclare : findAll()) {
			remove(attractionWaterGenDeclare);
		}
	}

	/**
	 * Returns the number of attraction water gen declares.
	 *
	 * @return the number of attraction water gen declares
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
					_SQL_COUNT_ATTRACTIONWATERGENDECLARE);

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
		return "attractionWaterGenDeclareId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONWATERGENDECLARE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionWaterGenDeclareModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction water gen declare persistence.
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

		AttractionWaterGenDeclareUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionWaterGenDeclareUtil.setPersistence(null);

		entityCache.removeCache(AttractionWaterGenDeclareImpl.class.getName());
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

	private static final String _SQL_SELECT_ATTRACTIONWATERGENDECLARE =
		"SELECT attractionWaterGenDeclare FROM AttractionWaterGenDeclare attractionWaterGenDeclare";

	private static final String _SQL_SELECT_ATTRACTIONWATERGENDECLARE_WHERE =
		"SELECT attractionWaterGenDeclare FROM AttractionWaterGenDeclare attractionWaterGenDeclare WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONWATERGENDECLARE =
		"SELECT COUNT(attractionWaterGenDeclare) FROM AttractionWaterGenDeclare attractionWaterGenDeclare";

	private static final String _SQL_COUNT_ATTRACTIONWATERGENDECLARE_WHERE =
		"SELECT COUNT(attractionWaterGenDeclare) FROM AttractionWaterGenDeclare attractionWaterGenDeclare WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionWaterGenDeclare.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionWaterGenDeclare exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionWaterGenDeclare exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionWaterGenDeclarePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}