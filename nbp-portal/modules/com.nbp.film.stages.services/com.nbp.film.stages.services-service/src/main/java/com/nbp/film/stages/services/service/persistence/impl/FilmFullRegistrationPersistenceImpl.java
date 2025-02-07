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

import com.nbp.film.stages.services.exception.NoSuchFilmFullRegistrationException;
import com.nbp.film.stages.services.model.FilmFullRegistration;
import com.nbp.film.stages.services.model.FilmFullRegistrationTable;
import com.nbp.film.stages.services.model.impl.FilmFullRegistrationImpl;
import com.nbp.film.stages.services.model.impl.FilmFullRegistrationModelImpl;
import com.nbp.film.stages.services.service.persistence.FilmFullRegistrationPersistence;
import com.nbp.film.stages.services.service.persistence.FilmFullRegistrationUtil;
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
 * The persistence implementation for the film full registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmFullRegistrationPersistence.class)
public class FilmFullRegistrationPersistenceImpl
	extends BasePersistenceImpl<FilmFullRegistration>
	implements FilmFullRegistrationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmFullRegistrationUtil</code> to access the film full registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmFullRegistrationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFilmFullRegistrationBy_CI;
	private FinderPath _finderPathCountBygetFilmFullRegistrationBy_CI;

	/**
	 * Returns the film full registration where caseId = &#63; or throws a <code>NoSuchFilmFullRegistrationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film full registration
	 * @throws NoSuchFilmFullRegistrationException if a matching film full registration could not be found
	 */
	@Override
	public FilmFullRegistration findBygetFilmFullRegistrationBy_CI(
			String caseId)
		throws NoSuchFilmFullRegistrationException {

		FilmFullRegistration filmFullRegistration =
			fetchBygetFilmFullRegistrationBy_CI(caseId);

		if (filmFullRegistration == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmFullRegistrationException(sb.toString());
		}

		return filmFullRegistration;
	}

	/**
	 * Returns the film full registration where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	@Override
	public FilmFullRegistration fetchBygetFilmFullRegistrationBy_CI(
		String caseId) {

		return fetchBygetFilmFullRegistrationBy_CI(caseId, true);
	}

	/**
	 * Returns the film full registration where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	@Override
	public FilmFullRegistration fetchBygetFilmFullRegistrationBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFilmFullRegistrationBy_CI, finderArgs,
				this);
		}

		if (result instanceof FilmFullRegistration) {
			FilmFullRegistration filmFullRegistration =
				(FilmFullRegistration)result;

			if (!Objects.equals(caseId, filmFullRegistration.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMFULLREGISTRATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_CI_CASEID_2);
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

				List<FilmFullRegistration> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFilmFullRegistrationBy_CI,
							finderArgs, list);
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
								"FilmFullRegistrationPersistenceImpl.fetchBygetFilmFullRegistrationBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmFullRegistration filmFullRegistration = list.get(0);

					result = filmFullRegistration;

					cacheResult(filmFullRegistration);
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
			return (FilmFullRegistration)result;
		}
	}

	/**
	 * Removes the film full registration where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film full registration that was removed
	 */
	@Override
	public FilmFullRegistration removeBygetFilmFullRegistrationBy_CI(
			String caseId)
		throws NoSuchFilmFullRegistrationException {

		FilmFullRegistration filmFullRegistration =
			findBygetFilmFullRegistrationBy_CI(caseId);

		return remove(filmFullRegistration);
	}

	/**
	 * Returns the number of film full registrations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film full registrations
	 */
	@Override
	public int countBygetFilmFullRegistrationBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFilmFullRegistrationBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMFULLREGISTRATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_CI_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_CI_CASEID_2 =
			"filmFullRegistration.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_CI_CASEID_3 =
			"(filmFullRegistration.caseId IS NULL OR filmFullRegistration.caseId = '')";

	private FinderPath _finderPathFetchBygetFilmFullRegistrationBy_RN;
	private FinderPath _finderPathCountBygetFilmFullRegistrationBy_RN;

	/**
	 * Returns the film full registration where registrationNumber = &#63; or throws a <code>NoSuchFilmFullRegistrationException</code> if it could not be found.
	 *
	 * @param registrationNumber the registration number
	 * @return the matching film full registration
	 * @throws NoSuchFilmFullRegistrationException if a matching film full registration could not be found
	 */
	@Override
	public FilmFullRegistration findBygetFilmFullRegistrationBy_RN(
			String registrationNumber)
		throws NoSuchFilmFullRegistrationException {

		FilmFullRegistration filmFullRegistration =
			fetchBygetFilmFullRegistrationBy_RN(registrationNumber);

		if (filmFullRegistration == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("registrationNumber=");
			sb.append(registrationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmFullRegistrationException(sb.toString());
		}

		return filmFullRegistration;
	}

	/**
	 * Returns the film full registration where registrationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param registrationNumber the registration number
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	@Override
	public FilmFullRegistration fetchBygetFilmFullRegistrationBy_RN(
		String registrationNumber) {

		return fetchBygetFilmFullRegistrationBy_RN(registrationNumber, true);
	}

	/**
	 * Returns the film full registration where registrationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param registrationNumber the registration number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	@Override
	public FilmFullRegistration fetchBygetFilmFullRegistrationBy_RN(
		String registrationNumber, boolean useFinderCache) {

		registrationNumber = Objects.toString(registrationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {registrationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFilmFullRegistrationBy_RN, finderArgs,
				this);
		}

		if (result instanceof FilmFullRegistration) {
			FilmFullRegistration filmFullRegistration =
				(FilmFullRegistration)result;

			if (!Objects.equals(
					registrationNumber,
					filmFullRegistration.getRegistrationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMFULLREGISTRATION_WHERE);

			boolean bindRegistrationNumber = false;

			if (registrationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_RN_REGISTRATIONNUMBER_3);
			}
			else {
				bindRegistrationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_RN_REGISTRATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindRegistrationNumber) {
					queryPos.add(registrationNumber);
				}

				List<FilmFullRegistration> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFilmFullRegistrationBy_RN,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {registrationNumber};
							}

							_log.warn(
								"FilmFullRegistrationPersistenceImpl.fetchBygetFilmFullRegistrationBy_RN(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmFullRegistration filmFullRegistration = list.get(0);

					result = filmFullRegistration;

					cacheResult(filmFullRegistration);
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
			return (FilmFullRegistration)result;
		}
	}

	/**
	 * Removes the film full registration where registrationNumber = &#63; from the database.
	 *
	 * @param registrationNumber the registration number
	 * @return the film full registration that was removed
	 */
	@Override
	public FilmFullRegistration removeBygetFilmFullRegistrationBy_RN(
			String registrationNumber)
		throws NoSuchFilmFullRegistrationException {

		FilmFullRegistration filmFullRegistration =
			findBygetFilmFullRegistrationBy_RN(registrationNumber);

		return remove(filmFullRegistration);
	}

	/**
	 * Returns the number of film full registrations where registrationNumber = &#63;.
	 *
	 * @param registrationNumber the registration number
	 * @return the number of matching film full registrations
	 */
	@Override
	public int countBygetFilmFullRegistrationBy_RN(String registrationNumber) {
		registrationNumber = Objects.toString(registrationNumber, "");

		FinderPath finderPath = _finderPathCountBygetFilmFullRegistrationBy_RN;

		Object[] finderArgs = new Object[] {registrationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMFULLREGISTRATION_WHERE);

			boolean bindRegistrationNumber = false;

			if (registrationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_RN_REGISTRATIONNUMBER_3);
			}
			else {
				bindRegistrationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_RN_REGISTRATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindRegistrationNumber) {
					queryPos.add(registrationNumber);
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

	private static final String
		_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_RN_REGISTRATIONNUMBER_2 =
			"filmFullRegistration.registrationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETFILMFULLREGISTRATIONBY_RN_REGISTRATIONNUMBER_3 =
			"(filmFullRegistration.registrationNumber IS NULL OR filmFullRegistration.registrationNumber = '')";

	public FilmFullRegistrationPersistenceImpl() {
		setModelClass(FilmFullRegistration.class);

		setModelImplClass(FilmFullRegistrationImpl.class);
		setModelPKClass(long.class);

		setTable(FilmFullRegistrationTable.INSTANCE);
	}

	/**
	 * Caches the film full registration in the entity cache if it is enabled.
	 *
	 * @param filmFullRegistration the film full registration
	 */
	@Override
	public void cacheResult(FilmFullRegistration filmFullRegistration) {
		entityCache.putResult(
			FilmFullRegistrationImpl.class,
			filmFullRegistration.getPrimaryKey(), filmFullRegistration);

		finderCache.putResult(
			_finderPathFetchBygetFilmFullRegistrationBy_CI,
			new Object[] {filmFullRegistration.getCaseId()},
			filmFullRegistration);

		finderCache.putResult(
			_finderPathFetchBygetFilmFullRegistrationBy_RN,
			new Object[] {filmFullRegistration.getRegistrationNumber()},
			filmFullRegistration);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film full registrations in the entity cache if it is enabled.
	 *
	 * @param filmFullRegistrations the film full registrations
	 */
	@Override
	public void cacheResult(List<FilmFullRegistration> filmFullRegistrations) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmFullRegistrations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmFullRegistration filmFullRegistration :
				filmFullRegistrations) {

			if (entityCache.getResult(
					FilmFullRegistrationImpl.class,
					filmFullRegistration.getPrimaryKey()) == null) {

				cacheResult(filmFullRegistration);
			}
		}
	}

	/**
	 * Clears the cache for all film full registrations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmFullRegistrationImpl.class);

		finderCache.clearCache(FilmFullRegistrationImpl.class);
	}

	/**
	 * Clears the cache for the film full registration.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilmFullRegistration filmFullRegistration) {
		entityCache.removeResult(
			FilmFullRegistrationImpl.class, filmFullRegistration);
	}

	@Override
	public void clearCache(List<FilmFullRegistration> filmFullRegistrations) {
		for (FilmFullRegistration filmFullRegistration :
				filmFullRegistrations) {

			entityCache.removeResult(
				FilmFullRegistrationImpl.class, filmFullRegistration);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmFullRegistrationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FilmFullRegistrationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmFullRegistrationModelImpl filmFullRegistrationModelImpl) {

		Object[] args = new Object[] {
			filmFullRegistrationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFilmFullRegistrationBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmFullRegistrationBy_CI, args,
			filmFullRegistrationModelImpl);

		args = new Object[] {
			filmFullRegistrationModelImpl.getRegistrationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetFilmFullRegistrationBy_RN, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmFullRegistrationBy_RN, args,
			filmFullRegistrationModelImpl);
	}

	/**
	 * Creates a new film full registration with the primary key. Does not add the film full registration to the database.
	 *
	 * @param filmFullRegistrationId the primary key for the new film full registration
	 * @return the new film full registration
	 */
	@Override
	public FilmFullRegistration create(long filmFullRegistrationId) {
		FilmFullRegistration filmFullRegistration =
			new FilmFullRegistrationImpl();

		filmFullRegistration.setNew(true);
		filmFullRegistration.setPrimaryKey(filmFullRegistrationId);

		filmFullRegistration.setCompanyId(CompanyThreadLocal.getCompanyId());

		return filmFullRegistration;
	}

	/**
	 * Removes the film full registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration that was removed
	 * @throws NoSuchFilmFullRegistrationException if a film full registration with the primary key could not be found
	 */
	@Override
	public FilmFullRegistration remove(long filmFullRegistrationId)
		throws NoSuchFilmFullRegistrationException {

		return remove((Serializable)filmFullRegistrationId);
	}

	/**
	 * Removes the film full registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film full registration
	 * @return the film full registration that was removed
	 * @throws NoSuchFilmFullRegistrationException if a film full registration with the primary key could not be found
	 */
	@Override
	public FilmFullRegistration remove(Serializable primaryKey)
		throws NoSuchFilmFullRegistrationException {

		Session session = null;

		try {
			session = openSession();

			FilmFullRegistration filmFullRegistration =
				(FilmFullRegistration)session.get(
					FilmFullRegistrationImpl.class, primaryKey);

			if (filmFullRegistration == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmFullRegistrationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmFullRegistration);
		}
		catch (NoSuchFilmFullRegistrationException noSuchEntityException) {
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
	protected FilmFullRegistration removeImpl(
		FilmFullRegistration filmFullRegistration) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmFullRegistration)) {
				filmFullRegistration = (FilmFullRegistration)session.get(
					FilmFullRegistrationImpl.class,
					filmFullRegistration.getPrimaryKeyObj());
			}

			if (filmFullRegistration != null) {
				session.delete(filmFullRegistration);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmFullRegistration != null) {
			clearCache(filmFullRegistration);
		}

		return filmFullRegistration;
	}

	@Override
	public FilmFullRegistration updateImpl(
		FilmFullRegistration filmFullRegistration) {

		boolean isNew = filmFullRegistration.isNew();

		if (!(filmFullRegistration instanceof FilmFullRegistrationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(filmFullRegistration.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					filmFullRegistration);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmFullRegistration proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmFullRegistration implementation " +
					filmFullRegistration.getClass());
		}

		FilmFullRegistrationModelImpl filmFullRegistrationModelImpl =
			(FilmFullRegistrationModelImpl)filmFullRegistration;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmFullRegistration.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmFullRegistration.setCreateDate(date);
			}
			else {
				filmFullRegistration.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmFullRegistrationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmFullRegistration.setModifiedDate(date);
			}
			else {
				filmFullRegistration.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmFullRegistration);
			}
			else {
				filmFullRegistration = (FilmFullRegistration)session.merge(
					filmFullRegistration);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmFullRegistrationImpl.class, filmFullRegistrationModelImpl,
			false, true);

		cacheUniqueFindersCache(filmFullRegistrationModelImpl);

		if (isNew) {
			filmFullRegistration.setNew(false);
		}

		filmFullRegistration.resetOriginalValues();

		return filmFullRegistration;
	}

	/**
	 * Returns the film full registration with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film full registration
	 * @return the film full registration
	 * @throws NoSuchFilmFullRegistrationException if a film full registration with the primary key could not be found
	 */
	@Override
	public FilmFullRegistration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmFullRegistrationException {

		FilmFullRegistration filmFullRegistration = fetchByPrimaryKey(
			primaryKey);

		if (filmFullRegistration == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmFullRegistrationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmFullRegistration;
	}

	/**
	 * Returns the film full registration with the primary key or throws a <code>NoSuchFilmFullRegistrationException</code> if it could not be found.
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration
	 * @throws NoSuchFilmFullRegistrationException if a film full registration with the primary key could not be found
	 */
	@Override
	public FilmFullRegistration findByPrimaryKey(long filmFullRegistrationId)
		throws NoSuchFilmFullRegistrationException {

		return findByPrimaryKey((Serializable)filmFullRegistrationId);
	}

	/**
	 * Returns the film full registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration, or <code>null</code> if a film full registration with the primary key could not be found
	 */
	@Override
	public FilmFullRegistration fetchByPrimaryKey(long filmFullRegistrationId) {
		return fetchByPrimaryKey((Serializable)filmFullRegistrationId);
	}

	/**
	 * Returns all the film full registrations.
	 *
	 * @return the film full registrations
	 */
	@Override
	public List<FilmFullRegistration> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film full registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmFullRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film full registrations
	 * @param end the upper bound of the range of film full registrations (not inclusive)
	 * @return the range of film full registrations
	 */
	@Override
	public List<FilmFullRegistration> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film full registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmFullRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film full registrations
	 * @param end the upper bound of the range of film full registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film full registrations
	 */
	@Override
	public List<FilmFullRegistration> findAll(
		int start, int end,
		OrderByComparator<FilmFullRegistration> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film full registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmFullRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film full registrations
	 * @param end the upper bound of the range of film full registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film full registrations
	 */
	@Override
	public List<FilmFullRegistration> findAll(
		int start, int end,
		OrderByComparator<FilmFullRegistration> orderByComparator,
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

		List<FilmFullRegistration> list = null;

		if (useFinderCache) {
			list = (List<FilmFullRegistration>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMFULLREGISTRATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMFULLREGISTRATION;

				sql = sql.concat(FilmFullRegistrationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmFullRegistration>)QueryUtil.list(
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
	 * Removes all the film full registrations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmFullRegistration filmFullRegistration : findAll()) {
			remove(filmFullRegistration);
		}
	}

	/**
	 * Returns the number of film full registrations.
	 *
	 * @return the number of film full registrations
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
					_SQL_COUNT_FILMFULLREGISTRATION);

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
		return "filmFullRegistrationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMFULLREGISTRATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmFullRegistrationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film full registration persistence.
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

		_finderPathFetchBygetFilmFullRegistrationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFilmFullRegistrationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFilmFullRegistrationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFilmFullRegistrationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetFilmFullRegistrationBy_RN = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFilmFullRegistrationBy_RN",
			new String[] {String.class.getName()},
			new String[] {"registrationNumber"}, true);

		_finderPathCountBygetFilmFullRegistrationBy_RN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFilmFullRegistrationBy_RN",
			new String[] {String.class.getName()},
			new String[] {"registrationNumber"}, false);

		FilmFullRegistrationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmFullRegistrationUtil.setPersistence(null);

		entityCache.removeCache(FilmFullRegistrationImpl.class.getName());
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

	private static final String _SQL_SELECT_FILMFULLREGISTRATION =
		"SELECT filmFullRegistration FROM FilmFullRegistration filmFullRegistration";

	private static final String _SQL_SELECT_FILMFULLREGISTRATION_WHERE =
		"SELECT filmFullRegistration FROM FilmFullRegistration filmFullRegistration WHERE ";

	private static final String _SQL_COUNT_FILMFULLREGISTRATION =
		"SELECT COUNT(filmFullRegistration) FROM FilmFullRegistration filmFullRegistration";

	private static final String _SQL_COUNT_FILMFULLREGISTRATION_WHERE =
		"SELECT COUNT(filmFullRegistration) FROM FilmFullRegistration filmFullRegistration WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"filmFullRegistration.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmFullRegistration exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmFullRegistration exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmFullRegistrationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}