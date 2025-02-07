/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence.impl;

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

import com.nbp.miic.application.form.services.exception.NoSuchMiicSuspensionOfCetException;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCet;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetTable;
import com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetImpl;
import com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetModelImpl;
import com.nbp.miic.application.form.services.service.persistence.MiicSuspensionOfCetPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSuspensionOfCetUtil;
import com.nbp.miic.application.form.services.service.persistence.impl.constants.MIIC_SERVICESPersistenceConstants;

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
 * The persistence implementation for the miic suspension of cet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiicSuspensionOfCetPersistence.class)
public class MiicSuspensionOfCetPersistenceImpl
	extends BasePersistenceImpl<MiicSuspensionOfCet>
	implements MiicSuspensionOfCetPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiicSuspensionOfCetUtil</code> to access the miic suspension of cet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiicSuspensionOfCetImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMiicById;
	private FinderPath _finderPathCountBygetMiicById;

	/**
	 * Returns the miic suspension of cet where miicApplicationId = &#63; or throws a <code>NoSuchMiicSuspensionOfCetException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic suspension of cet
	 * @throws NoSuchMiicSuspensionOfCetException if a matching miic suspension of cet could not be found
	 */
	@Override
	public MiicSuspensionOfCet findBygetMiicById(long miicApplicationId)
		throws NoSuchMiicSuspensionOfCetException {

		MiicSuspensionOfCet miicSuspensionOfCet = fetchBygetMiicById(
			miicApplicationId);

		if (miicSuspensionOfCet == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miicApplicationId=");
			sb.append(miicApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiicSuspensionOfCetException(sb.toString());
		}

		return miicSuspensionOfCet;
	}

	/**
	 * Returns the miic suspension of cet where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic suspension of cet, or <code>null</code> if a matching miic suspension of cet could not be found
	 */
	@Override
	public MiicSuspensionOfCet fetchBygetMiicById(long miicApplicationId) {
		return fetchBygetMiicById(miicApplicationId, true);
	}

	/**
	 * Returns the miic suspension of cet where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic suspension of cet, or <code>null</code> if a matching miic suspension of cet could not be found
	 */
	@Override
	public MiicSuspensionOfCet fetchBygetMiicById(
		long miicApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {miicApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMiicById, finderArgs, this);
		}

		if (result instanceof MiicSuspensionOfCet) {
			MiicSuspensionOfCet miicSuspensionOfCet =
				(MiicSuspensionOfCet)result;

			if (miicApplicationId !=
					miicSuspensionOfCet.getMiicApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MIICSUSPENSIONOFCET_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

				List<MiicSuspensionOfCet> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiicById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {miicApplicationId};
							}

							_log.warn(
								"MiicSuspensionOfCetPersistenceImpl.fetchBygetMiicById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicSuspensionOfCet miicSuspensionOfCet = list.get(0);

					result = miicSuspensionOfCet;

					cacheResult(miicSuspensionOfCet);
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
			return (MiicSuspensionOfCet)result;
		}
	}

	/**
	 * Removes the miic suspension of cet where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic suspension of cet that was removed
	 */
	@Override
	public MiicSuspensionOfCet removeBygetMiicById(long miicApplicationId)
		throws NoSuchMiicSuspensionOfCetException {

		MiicSuspensionOfCet miicSuspensionOfCet = findBygetMiicById(
			miicApplicationId);

		return remove(miicSuspensionOfCet);
	}

	/**
	 * Returns the number of miic suspension of cets where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic suspension of cets
	 */
	@Override
	public int countBygetMiicById(long miicApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiicById;

		Object[] finderArgs = new Object[] {miicApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICSUSPENSIONOFCET_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

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

	private static final String _FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2 =
		"miicSuspensionOfCet.miicApplicationId = ?";

	public MiicSuspensionOfCetPersistenceImpl() {
		setModelClass(MiicSuspensionOfCet.class);

		setModelImplClass(MiicSuspensionOfCetImpl.class);
		setModelPKClass(long.class);

		setTable(MiicSuspensionOfCetTable.INSTANCE);
	}

	/**
	 * Caches the miic suspension of cet in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCet the miic suspension of cet
	 */
	@Override
	public void cacheResult(MiicSuspensionOfCet miicSuspensionOfCet) {
		entityCache.putResult(
			MiicSuspensionOfCetImpl.class, miicSuspensionOfCet.getPrimaryKey(),
			miicSuspensionOfCet);

		finderCache.putResult(
			_finderPathFetchBygetMiicById,
			new Object[] {miicSuspensionOfCet.getMiicApplicationId()},
			miicSuspensionOfCet);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the miic suspension of cets in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCets the miic suspension of cets
	 */
	@Override
	public void cacheResult(List<MiicSuspensionOfCet> miicSuspensionOfCets) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miicSuspensionOfCets.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiicSuspensionOfCet miicSuspensionOfCet : miicSuspensionOfCets) {
			if (entityCache.getResult(
					MiicSuspensionOfCetImpl.class,
					miicSuspensionOfCet.getPrimaryKey()) == null) {

				cacheResult(miicSuspensionOfCet);
			}
		}
	}

	/**
	 * Clears the cache for all miic suspension of cets.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiicSuspensionOfCetImpl.class);

		finderCache.clearCache(MiicSuspensionOfCetImpl.class);
	}

	/**
	 * Clears the cache for the miic suspension of cet.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiicSuspensionOfCet miicSuspensionOfCet) {
		entityCache.removeResult(
			MiicSuspensionOfCetImpl.class, miicSuspensionOfCet);
	}

	@Override
	public void clearCache(List<MiicSuspensionOfCet> miicSuspensionOfCets) {
		for (MiicSuspensionOfCet miicSuspensionOfCet : miicSuspensionOfCets) {
			entityCache.removeResult(
				MiicSuspensionOfCetImpl.class, miicSuspensionOfCet);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiicSuspensionOfCetImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(MiicSuspensionOfCetImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiicSuspensionOfCetModelImpl miicSuspensionOfCetModelImpl) {

		Object[] args = new Object[] {
			miicSuspensionOfCetModelImpl.getMiicApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMiicById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiicById, args, miicSuspensionOfCetModelImpl);
	}

	/**
	 * Creates a new miic suspension of cet with the primary key. Does not add the miic suspension of cet to the database.
	 *
	 * @param miicSuspensionOfCetId the primary key for the new miic suspension of cet
	 * @return the new miic suspension of cet
	 */
	@Override
	public MiicSuspensionOfCet create(long miicSuspensionOfCetId) {
		MiicSuspensionOfCet miicSuspensionOfCet = new MiicSuspensionOfCetImpl();

		miicSuspensionOfCet.setNew(true);
		miicSuspensionOfCet.setPrimaryKey(miicSuspensionOfCetId);

		miicSuspensionOfCet.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miicSuspensionOfCet;
	}

	/**
	 * Removes the miic suspension of cet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet that was removed
	 * @throws NoSuchMiicSuspensionOfCetException if a miic suspension of cet with the primary key could not be found
	 */
	@Override
	public MiicSuspensionOfCet remove(long miicSuspensionOfCetId)
		throws NoSuchMiicSuspensionOfCetException {

		return remove((Serializable)miicSuspensionOfCetId);
	}

	/**
	 * Removes the miic suspension of cet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the miic suspension of cet
	 * @return the miic suspension of cet that was removed
	 * @throws NoSuchMiicSuspensionOfCetException if a miic suspension of cet with the primary key could not be found
	 */
	@Override
	public MiicSuspensionOfCet remove(Serializable primaryKey)
		throws NoSuchMiicSuspensionOfCetException {

		Session session = null;

		try {
			session = openSession();

			MiicSuspensionOfCet miicSuspensionOfCet =
				(MiicSuspensionOfCet)session.get(
					MiicSuspensionOfCetImpl.class, primaryKey);

			if (miicSuspensionOfCet == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiicSuspensionOfCetException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miicSuspensionOfCet);
		}
		catch (NoSuchMiicSuspensionOfCetException noSuchEntityException) {
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
	protected MiicSuspensionOfCet removeImpl(
		MiicSuspensionOfCet miicSuspensionOfCet) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miicSuspensionOfCet)) {
				miicSuspensionOfCet = (MiicSuspensionOfCet)session.get(
					MiicSuspensionOfCetImpl.class,
					miicSuspensionOfCet.getPrimaryKeyObj());
			}

			if (miicSuspensionOfCet != null) {
				session.delete(miicSuspensionOfCet);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miicSuspensionOfCet != null) {
			clearCache(miicSuspensionOfCet);
		}

		return miicSuspensionOfCet;
	}

	@Override
	public MiicSuspensionOfCet updateImpl(
		MiicSuspensionOfCet miicSuspensionOfCet) {

		boolean isNew = miicSuspensionOfCet.isNew();

		if (!(miicSuspensionOfCet instanceof MiicSuspensionOfCetModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miicSuspensionOfCet.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miicSuspensionOfCet);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miicSuspensionOfCet proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiicSuspensionOfCet implementation " +
					miicSuspensionOfCet.getClass());
		}

		MiicSuspensionOfCetModelImpl miicSuspensionOfCetModelImpl =
			(MiicSuspensionOfCetModelImpl)miicSuspensionOfCet;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miicSuspensionOfCet.getCreateDate() == null)) {
			if (serviceContext == null) {
				miicSuspensionOfCet.setCreateDate(date);
			}
			else {
				miicSuspensionOfCet.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miicSuspensionOfCetModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miicSuspensionOfCet.setModifiedDate(date);
			}
			else {
				miicSuspensionOfCet.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miicSuspensionOfCet);
			}
			else {
				miicSuspensionOfCet = (MiicSuspensionOfCet)session.merge(
					miicSuspensionOfCet);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiicSuspensionOfCetImpl.class, miicSuspensionOfCetModelImpl, false,
			true);

		cacheUniqueFindersCache(miicSuspensionOfCetModelImpl);

		if (isNew) {
			miicSuspensionOfCet.setNew(false);
		}

		miicSuspensionOfCet.resetOriginalValues();

		return miicSuspensionOfCet;
	}

	/**
	 * Returns the miic suspension of cet with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the miic suspension of cet
	 * @return the miic suspension of cet
	 * @throws NoSuchMiicSuspensionOfCetException if a miic suspension of cet with the primary key could not be found
	 */
	@Override
	public MiicSuspensionOfCet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiicSuspensionOfCetException {

		MiicSuspensionOfCet miicSuspensionOfCet = fetchByPrimaryKey(primaryKey);

		if (miicSuspensionOfCet == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiicSuspensionOfCetException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miicSuspensionOfCet;
	}

	/**
	 * Returns the miic suspension of cet with the primary key or throws a <code>NoSuchMiicSuspensionOfCetException</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet
	 * @throws NoSuchMiicSuspensionOfCetException if a miic suspension of cet with the primary key could not be found
	 */
	@Override
	public MiicSuspensionOfCet findByPrimaryKey(long miicSuspensionOfCetId)
		throws NoSuchMiicSuspensionOfCetException {

		return findByPrimaryKey((Serializable)miicSuspensionOfCetId);
	}

	/**
	 * Returns the miic suspension of cet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet, or <code>null</code> if a miic suspension of cet with the primary key could not be found
	 */
	@Override
	public MiicSuspensionOfCet fetchByPrimaryKey(long miicSuspensionOfCetId) {
		return fetchByPrimaryKey((Serializable)miicSuspensionOfCetId);
	}

	/**
	 * Returns all the miic suspension of cets.
	 *
	 * @return the miic suspension of cets
	 */
	@Override
	public List<MiicSuspensionOfCet> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic suspension of cets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cets
	 * @param end the upper bound of the range of miic suspension of cets (not inclusive)
	 * @return the range of miic suspension of cets
	 */
	@Override
	public List<MiicSuspensionOfCet> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cets
	 * @param end the upper bound of the range of miic suspension of cets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic suspension of cets
	 */
	@Override
	public List<MiicSuspensionOfCet> findAll(
		int start, int end,
		OrderByComparator<MiicSuspensionOfCet> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cets
	 * @param end the upper bound of the range of miic suspension of cets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic suspension of cets
	 */
	@Override
	public List<MiicSuspensionOfCet> findAll(
		int start, int end,
		OrderByComparator<MiicSuspensionOfCet> orderByComparator,
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

		List<MiicSuspensionOfCet> list = null;

		if (useFinderCache) {
			list = (List<MiicSuspensionOfCet>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MIICSUSPENSIONOFCET);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MIICSUSPENSIONOFCET;

				sql = sql.concat(MiicSuspensionOfCetModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiicSuspensionOfCet>)QueryUtil.list(
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
	 * Removes all the miic suspension of cets from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiicSuspensionOfCet miicSuspensionOfCet : findAll()) {
			remove(miicSuspensionOfCet);
		}
	}

	/**
	 * Returns the number of miic suspension of cets.
	 *
	 * @return the number of miic suspension of cets
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
					_SQL_COUNT_MIICSUSPENSIONOFCET);

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
		return "miicSuspensionOfCetId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MIICSUSPENSIONOFCET;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiicSuspensionOfCetModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the miic suspension of cet persistence.
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

		_finderPathFetchBygetMiicById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMiicById",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, true);

		_finderPathCountBygetMiicById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMiicById",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, false);

		MiicSuspensionOfCetUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiicSuspensionOfCetUtil.setPersistence(null);

		entityCache.removeCache(MiicSuspensionOfCetImpl.class.getName());
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MIICSUSPENSIONOFCET =
		"SELECT miicSuspensionOfCet FROM MiicSuspensionOfCet miicSuspensionOfCet";

	private static final String _SQL_SELECT_MIICSUSPENSIONOFCET_WHERE =
		"SELECT miicSuspensionOfCet FROM MiicSuspensionOfCet miicSuspensionOfCet WHERE ";

	private static final String _SQL_COUNT_MIICSUSPENSIONOFCET =
		"SELECT COUNT(miicSuspensionOfCet) FROM MiicSuspensionOfCet miicSuspensionOfCet";

	private static final String _SQL_COUNT_MIICSUSPENSIONOFCET_WHERE =
		"SELECT COUNT(miicSuspensionOfCet) FROM MiicSuspensionOfCet miicSuspensionOfCet WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "miicSuspensionOfCet.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiicSuspensionOfCet exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiicSuspensionOfCet exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiicSuspensionOfCetPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}