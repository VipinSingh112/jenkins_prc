/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence.impl;

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

import com.nbp.film.stages.services.exception.NoSuchFilmApplicationRegisterException;
import com.nbp.film.stages.services.model.FilmApplicationRegister;
import com.nbp.film.stages.services.model.FilmApplicationRegisterTable;
import com.nbp.film.stages.services.model.impl.FilmApplicationRegisterImpl;
import com.nbp.film.stages.services.model.impl.FilmApplicationRegisterModelImpl;
import com.nbp.film.stages.services.service.persistence.FilmApplicationRegisterPersistence;
import com.nbp.film.stages.services.service.persistence.FilmApplicationRegisterUtil;
import com.nbp.film.stages.services.service.persistence.impl.constants.FILM_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the film application register service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmApplicationRegisterPersistence.class)
public class FilmApplicationRegisterPersistenceImpl
	extends BasePersistenceImpl<FilmApplicationRegister>
	implements FilmApplicationRegisterPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmApplicationRegisterUtil</code> to access the film application register persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmApplicationRegisterImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFilmByCI;
	private FinderPath _finderPathCountBygetFilmByCI;

	/**
	 * Returns the film application register where caseId = &#63; or throws a <code>NoSuchFilmApplicationRegisterException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film application register
	 * @throws NoSuchFilmApplicationRegisterException if a matching film application register could not be found
	 */
	@Override
	public FilmApplicationRegister findBygetFilmByCI(String caseId)
		throws NoSuchFilmApplicationRegisterException {

		FilmApplicationRegister filmApplicationRegister = fetchBygetFilmByCI(
			caseId);

		if (filmApplicationRegister == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmApplicationRegisterException(sb.toString());
		}

		return filmApplicationRegister;
	}

	/**
	 * Returns the film application register where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film application register, or <code>null</code> if a matching film application register could not be found
	 */
	@Override
	public FilmApplicationRegister fetchBygetFilmByCI(String caseId) {
		return fetchBygetFilmByCI(caseId, true);
	}

	/**
	 * Returns the film application register where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application register, or <code>null</code> if a matching film application register could not be found
	 */
	@Override
	public FilmApplicationRegister fetchBygetFilmByCI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFilmByCI, finderArgs, this);
		}

		if (result instanceof FilmApplicationRegister) {
			FilmApplicationRegister filmApplicationRegister =
				(FilmApplicationRegister)result;

			if (!Objects.equals(caseId, filmApplicationRegister.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMAPPLICATIONREGISTER_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFILMBYCI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFILMBYCI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<FilmApplicationRegister> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFilmByCI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"FilmApplicationRegisterPersistenceImpl.fetchBygetFilmByCI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmApplicationRegister filmApplicationRegister = list.get(
						0);

					result = filmApplicationRegister;

					cacheResult(filmApplicationRegister);
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
			return (FilmApplicationRegister)result;
		}
	}

	/**
	 * Removes the film application register where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film application register that was removed
	 */
	@Override
	public FilmApplicationRegister removeBygetFilmByCI(String caseId)
		throws NoSuchFilmApplicationRegisterException {

		FilmApplicationRegister filmApplicationRegister = findBygetFilmByCI(
			caseId);

		return remove(filmApplicationRegister);
	}

	/**
	 * Returns the number of film application registers where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film application registers
	 */
	@Override
	public int countBygetFilmByCI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFilmByCI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMAPPLICATIONREGISTER_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFILMBYCI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFILMBYCI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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

	private static final String _FINDER_COLUMN_GETFILMBYCI_CASEID_2 =
		"filmApplicationRegister.caseId = ?";

	private static final String _FINDER_COLUMN_GETFILMBYCI_CASEID_3 =
		"(filmApplicationRegister.caseId IS NULL OR filmApplicationRegister.caseId = '')";

	public FilmApplicationRegisterPersistenceImpl() {
		setModelClass(FilmApplicationRegister.class);

		setModelImplClass(FilmApplicationRegisterImpl.class);
		setModelPKClass(long.class);

		setTable(FilmApplicationRegisterTable.INSTANCE);
	}

	/**
	 * Caches the film application register in the entity cache if it is enabled.
	 *
	 * @param filmApplicationRegister the film application register
	 */
	@Override
	public void cacheResult(FilmApplicationRegister filmApplicationRegister) {
		entityCache.putResult(
			FilmApplicationRegisterImpl.class,
			filmApplicationRegister.getPrimaryKey(), filmApplicationRegister);

		finderCache.putResult(
			_finderPathFetchBygetFilmByCI,
			new Object[] {filmApplicationRegister.getCaseId()},
			filmApplicationRegister);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film application registers in the entity cache if it is enabled.
	 *
	 * @param filmApplicationRegisters the film application registers
	 */
	@Override
	public void cacheResult(
		List<FilmApplicationRegister> filmApplicationRegisters) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmApplicationRegisters.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmApplicationRegister filmApplicationRegister :
				filmApplicationRegisters) {

			if (entityCache.getResult(
					FilmApplicationRegisterImpl.class,
					filmApplicationRegister.getPrimaryKey()) == null) {

				cacheResult(filmApplicationRegister);
			}
		}
	}

	/**
	 * Clears the cache for all film application registers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmApplicationRegisterImpl.class);

		finderCache.clearCache(FilmApplicationRegisterImpl.class);
	}

	/**
	 * Clears the cache for the film application register.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilmApplicationRegister filmApplicationRegister) {
		entityCache.removeResult(
			FilmApplicationRegisterImpl.class, filmApplicationRegister);
	}

	@Override
	public void clearCache(
		List<FilmApplicationRegister> filmApplicationRegisters) {

		for (FilmApplicationRegister filmApplicationRegister :
				filmApplicationRegisters) {

			entityCache.removeResult(
				FilmApplicationRegisterImpl.class, filmApplicationRegister);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmApplicationRegisterImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FilmApplicationRegisterImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmApplicationRegisterModelImpl filmApplicationRegisterModelImpl) {

		Object[] args = new Object[] {
			filmApplicationRegisterModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFilmByCI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmByCI, args,
			filmApplicationRegisterModelImpl);
	}

	/**
	 * Creates a new film application register with the primary key. Does not add the film application register to the database.
	 *
	 * @param filmApplicationRegisterId the primary key for the new film application register
	 * @return the new film application register
	 */
	@Override
	public FilmApplicationRegister create(long filmApplicationRegisterId) {
		FilmApplicationRegister filmApplicationRegister =
			new FilmApplicationRegisterImpl();

		filmApplicationRegister.setNew(true);
		filmApplicationRegister.setPrimaryKey(filmApplicationRegisterId);

		filmApplicationRegister.setCompanyId(CompanyThreadLocal.getCompanyId());

		return filmApplicationRegister;
	}

	/**
	 * Removes the film application register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register that was removed
	 * @throws NoSuchFilmApplicationRegisterException if a film application register with the primary key could not be found
	 */
	@Override
	public FilmApplicationRegister remove(long filmApplicationRegisterId)
		throws NoSuchFilmApplicationRegisterException {

		return remove((Serializable)filmApplicationRegisterId);
	}

	/**
	 * Removes the film application register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film application register
	 * @return the film application register that was removed
	 * @throws NoSuchFilmApplicationRegisterException if a film application register with the primary key could not be found
	 */
	@Override
	public FilmApplicationRegister remove(Serializable primaryKey)
		throws NoSuchFilmApplicationRegisterException {

		Session session = null;

		try {
			session = openSession();

			FilmApplicationRegister filmApplicationRegister =
				(FilmApplicationRegister)session.get(
					FilmApplicationRegisterImpl.class, primaryKey);

			if (filmApplicationRegister == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmApplicationRegisterException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmApplicationRegister);
		}
		catch (NoSuchFilmApplicationRegisterException noSuchEntityException) {
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
	protected FilmApplicationRegister removeImpl(
		FilmApplicationRegister filmApplicationRegister) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmApplicationRegister)) {
				filmApplicationRegister = (FilmApplicationRegister)session.get(
					FilmApplicationRegisterImpl.class,
					filmApplicationRegister.getPrimaryKeyObj());
			}

			if (filmApplicationRegister != null) {
				session.delete(filmApplicationRegister);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmApplicationRegister != null) {
			clearCache(filmApplicationRegister);
		}

		return filmApplicationRegister;
	}

	@Override
	public FilmApplicationRegister updateImpl(
		FilmApplicationRegister filmApplicationRegister) {

		boolean isNew = filmApplicationRegister.isNew();

		if (!(filmApplicationRegister instanceof
				FilmApplicationRegisterModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(filmApplicationRegister.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					filmApplicationRegister);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmApplicationRegister proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmApplicationRegister implementation " +
					filmApplicationRegister.getClass());
		}

		FilmApplicationRegisterModelImpl filmApplicationRegisterModelImpl =
			(FilmApplicationRegisterModelImpl)filmApplicationRegister;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmApplicationRegister.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmApplicationRegister.setCreateDate(date);
			}
			else {
				filmApplicationRegister.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmApplicationRegisterModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmApplicationRegister.setModifiedDate(date);
			}
			else {
				filmApplicationRegister.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmApplicationRegister);
			}
			else {
				filmApplicationRegister =
					(FilmApplicationRegister)session.merge(
						filmApplicationRegister);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmApplicationRegisterImpl.class, filmApplicationRegisterModelImpl,
			false, true);

		cacheUniqueFindersCache(filmApplicationRegisterModelImpl);

		if (isNew) {
			filmApplicationRegister.setNew(false);
		}

		filmApplicationRegister.resetOriginalValues();

		return filmApplicationRegister;
	}

	/**
	 * Returns the film application register with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film application register
	 * @return the film application register
	 * @throws NoSuchFilmApplicationRegisterException if a film application register with the primary key could not be found
	 */
	@Override
	public FilmApplicationRegister findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmApplicationRegisterException {

		FilmApplicationRegister filmApplicationRegister = fetchByPrimaryKey(
			primaryKey);

		if (filmApplicationRegister == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmApplicationRegisterException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmApplicationRegister;
	}

	/**
	 * Returns the film application register with the primary key or throws a <code>NoSuchFilmApplicationRegisterException</code> if it could not be found.
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register
	 * @throws NoSuchFilmApplicationRegisterException if a film application register with the primary key could not be found
	 */
	@Override
	public FilmApplicationRegister findByPrimaryKey(
			long filmApplicationRegisterId)
		throws NoSuchFilmApplicationRegisterException {

		return findByPrimaryKey((Serializable)filmApplicationRegisterId);
	}

	/**
	 * Returns the film application register with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register, or <code>null</code> if a film application register with the primary key could not be found
	 */
	@Override
	public FilmApplicationRegister fetchByPrimaryKey(
		long filmApplicationRegisterId) {

		return fetchByPrimaryKey((Serializable)filmApplicationRegisterId);
	}

	/**
	 * Returns all the film application registers.
	 *
	 * @return the film application registers
	 */
	@Override
	public List<FilmApplicationRegister> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film application registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application registers
	 * @param end the upper bound of the range of film application registers (not inclusive)
	 * @return the range of film application registers
	 */
	@Override
	public List<FilmApplicationRegister> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film application registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application registers
	 * @param end the upper bound of the range of film application registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film application registers
	 */
	@Override
	public List<FilmApplicationRegister> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationRegister> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film application registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application registers
	 * @param end the upper bound of the range of film application registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film application registers
	 */
	@Override
	public List<FilmApplicationRegister> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationRegister> orderByComparator,
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

		List<FilmApplicationRegister> list = null;

		if (useFinderCache) {
			list = (List<FilmApplicationRegister>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMAPPLICATIONREGISTER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMAPPLICATIONREGISTER;

				sql = sql.concat(
					FilmApplicationRegisterModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmApplicationRegister>)QueryUtil.list(
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
	 * Removes all the film application registers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmApplicationRegister filmApplicationRegister : findAll()) {
			remove(filmApplicationRegister);
		}
	}

	/**
	 * Returns the number of film application registers.
	 *
	 * @return the number of film application registers
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
					_SQL_COUNT_FILMAPPLICATIONREGISTER);

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
		return "filmApplicationRegisterId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMAPPLICATIONREGISTER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmApplicationRegisterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film application register persistence.
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

		_finderPathFetchBygetFilmByCI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFilmByCI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFilmByCI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFilmByCI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		FilmApplicationRegisterUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmApplicationRegisterUtil.setPersistence(null);

		entityCache.removeCache(FilmApplicationRegisterImpl.class.getName());
	}

	@Override
	@Reference(
		target = FILM_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FILM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FILM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FILMAPPLICATIONREGISTER =
		"SELECT filmApplicationRegister FROM FilmApplicationRegister filmApplicationRegister";

	private static final String _SQL_SELECT_FILMAPPLICATIONREGISTER_WHERE =
		"SELECT filmApplicationRegister FROM FilmApplicationRegister filmApplicationRegister WHERE ";

	private static final String _SQL_COUNT_FILMAPPLICATIONREGISTER =
		"SELECT COUNT(filmApplicationRegister) FROM FilmApplicationRegister filmApplicationRegister";

	private static final String _SQL_COUNT_FILMAPPLICATIONREGISTER_WHERE =
		"SELECT COUNT(filmApplicationRegister) FROM FilmApplicationRegister filmApplicationRegister WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"filmApplicationRegister.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmApplicationRegister exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmApplicationRegister exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmApplicationRegisterPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}