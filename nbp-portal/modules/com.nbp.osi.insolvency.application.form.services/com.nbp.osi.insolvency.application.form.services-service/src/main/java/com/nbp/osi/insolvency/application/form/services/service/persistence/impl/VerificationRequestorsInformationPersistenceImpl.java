/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchVerificationRequestorsInformationException;
import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInformation;
import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInformationTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationRequestorsInformationPK;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationRequestorsInformationPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationRequestorsInformationUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the verification requestors information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {
		VerificationRequestorsInformationPersistence.class,
		BasePersistence.class
	}
)
public class VerificationRequestorsInformationPersistenceImpl
	extends BasePersistenceImpl<VerificationRequestorsInformation>
	implements VerificationRequestorsInformationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>VerificationRequestorsInformationUtil</code> to access the verification requestors information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		VerificationRequestorsInformationImpl.class.getName();

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
	 * Returns the verification requestors information where osiInsolvencyId = &#63; or throws a <code>NoSuchVerificationRequestorsInformationException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors information
	 * @throws NoSuchVerificationRequestorsInformationException if a matching verification requestors information could not be found
	 */
	@Override
	public VerificationRequestorsInformation findBygetOsiById(
			long osiInsolvencyId)
		throws NoSuchVerificationRequestorsInformationException {

		VerificationRequestorsInformation verificationRequestorsInformation =
			fetchBygetOsiById(osiInsolvencyId);

		if (verificationRequestorsInformation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchVerificationRequestorsInformationException(
				sb.toString());
		}

		return verificationRequestorsInformation;
	}

	/**
	 * Returns the verification requestors information where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors information, or <code>null</code> if a matching verification requestors information could not be found
	 */
	@Override
	public VerificationRequestorsInformation fetchBygetOsiById(
		long osiInsolvencyId) {

		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the verification requestors information where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching verification requestors information, or <code>null</code> if a matching verification requestors information could not be found
	 */
	@Override
	public VerificationRequestorsInformation fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiById, finderArgs,this);
		}

		if (result instanceof VerificationRequestorsInformation) {
			VerificationRequestorsInformation
				verificationRequestorsInformation =
					(VerificationRequestorsInformation)result;

			if (osiInsolvencyId !=
					verificationRequestorsInformation.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_VERIFICATIONREQUESTORSINFORMATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<VerificationRequestorsInformation> list = query.list();

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
								"VerificationRequestorsInformationPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VerificationRequestorsInformation
						verificationRequestorsInformation = list.get(0);

					result = verificationRequestorsInformation;

					cacheResult(verificationRequestorsInformation);
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
			return (VerificationRequestorsInformation)result;
		}
	}

	/**
	 * Removes the verification requestors information where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the verification requestors information that was removed
	 */
	@Override
	public VerificationRequestorsInformation removeBygetOsiById(
			long osiInsolvencyId)
		throws NoSuchVerificationRequestorsInformationException {

		VerificationRequestorsInformation verificationRequestorsInformation =
			findBygetOsiById(osiInsolvencyId);

		return remove(verificationRequestorsInformation);
	}

	/**
	 * Returns the number of verification requestors informations where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching verification requestors informations
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VERIFICATIONREQUESTORSINFORMATION_WHERE);

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
		"verificationRequestorsInformation.id.osiInsolvencyId = ?";

	public VerificationRequestorsInformationPersistenceImpl() {
		setModelClass(VerificationRequestorsInformation.class);

		setModelImplClass(VerificationRequestorsInformationImpl.class);
		setModelPKClass(VerificationRequestorsInformationPK.class);

		setTable(VerificationRequestorsInformationTable.INSTANCE);
	}

	/**
	 * Caches the verification requestors information in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInformation the verification requestors information
	 */
	@Override
	public void cacheResult(
		VerificationRequestorsInformation verificationRequestorsInformation) {

		entityCache.putResult(
			VerificationRequestorsInformationImpl.class,
			verificationRequestorsInformation.getPrimaryKey(),
			verificationRequestorsInformation);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {
				verificationRequestorsInformation.getOsiInsolvencyId()
			},
			verificationRequestorsInformation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the verification requestors informations in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInformations the verification requestors informations
	 */
	@Override
	public void cacheResult(
		List<VerificationRequestorsInformation>
			verificationRequestorsInformations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (verificationRequestorsInformations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (VerificationRequestorsInformation
				verificationRequestorsInformation :
					verificationRequestorsInformations) {

			if (entityCache.getResult(
					VerificationRequestorsInformationImpl.class,
					verificationRequestorsInformation.getPrimaryKey()) ==
						null) {

				cacheResult(verificationRequestorsInformation);
			}
		}
	}

	/**
	 * Clears the cache for all verification requestors informations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VerificationRequestorsInformationImpl.class);

		finderCache.clearCache(VerificationRequestorsInformationImpl.class);
	}

	/**
	 * Clears the cache for the verification requestors information.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VerificationRequestorsInformation verificationRequestorsInformation) {

		entityCache.removeResult(
			VerificationRequestorsInformationImpl.class,
			verificationRequestorsInformation);
	}

	@Override
	public void clearCache(
		List<VerificationRequestorsInformation>
			verificationRequestorsInformations) {

		for (VerificationRequestorsInformation
				verificationRequestorsInformation :
					verificationRequestorsInformations) {

			entityCache.removeResult(
				VerificationRequestorsInformationImpl.class,
				verificationRequestorsInformation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(VerificationRequestorsInformationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				VerificationRequestorsInformationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		VerificationRequestorsInformationModelImpl
			verificationRequestorsInformationModelImpl) {

		Object[] args = new Object[] {
			verificationRequestorsInformationModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args,
			verificationRequestorsInformationModelImpl);
	}

	/**
	 * Creates a new verification requestors information with the primary key. Does not add the verification requestors information to the database.
	 *
	 * @param verificationRequestorsInformationPK the primary key for the new verification requestors information
	 * @return the new verification requestors information
	 */
	@Override
	public VerificationRequestorsInformation create(
		VerificationRequestorsInformationPK
			verificationRequestorsInformationPK) {

		VerificationRequestorsInformation verificationRequestorsInformation =
			new VerificationRequestorsInformationImpl();

		verificationRequestorsInformation.setNew(true);
		verificationRequestorsInformation.setPrimaryKey(
			verificationRequestorsInformationPK);

		verificationRequestorsInformation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return verificationRequestorsInformation;
	}

	/**
	 * Removes the verification requestors information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information that was removed
	 * @throws NoSuchVerificationRequestorsInformationException if a verification requestors information with the primary key could not be found
	 */
	@Override
	public VerificationRequestorsInformation remove(
			VerificationRequestorsInformationPK
				verificationRequestorsInformationPK)
		throws NoSuchVerificationRequestorsInformationException {

		return remove((Serializable)verificationRequestorsInformationPK);
	}

	/**
	 * Removes the verification requestors information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the verification requestors information
	 * @return the verification requestors information that was removed
	 * @throws NoSuchVerificationRequestorsInformationException if a verification requestors information with the primary key could not be found
	 */
	@Override
	public VerificationRequestorsInformation remove(Serializable primaryKey)
		throws NoSuchVerificationRequestorsInformationException {

		Session session = null;

		try {
			session = openSession();

			VerificationRequestorsInformation
				verificationRequestorsInformation =
					(VerificationRequestorsInformation)session.get(
						VerificationRequestorsInformationImpl.class,
						primaryKey);

			if (verificationRequestorsInformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVerificationRequestorsInformationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(verificationRequestorsInformation);
		}
		catch (NoSuchVerificationRequestorsInformationException
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
	protected VerificationRequestorsInformation removeImpl(
		VerificationRequestorsInformation verificationRequestorsInformation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(verificationRequestorsInformation)) {
				verificationRequestorsInformation =
					(VerificationRequestorsInformation)session.get(
						VerificationRequestorsInformationImpl.class,
						verificationRequestorsInformation.getPrimaryKeyObj());
			}

			if (verificationRequestorsInformation != null) {
				session.delete(verificationRequestorsInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (verificationRequestorsInformation != null) {
			clearCache(verificationRequestorsInformation);
		}

		return verificationRequestorsInformation;
	}

	@Override
	public VerificationRequestorsInformation updateImpl(
		VerificationRequestorsInformation verificationRequestorsInformation) {

		boolean isNew = verificationRequestorsInformation.isNew();

		if (!(verificationRequestorsInformation instanceof
				VerificationRequestorsInformationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					verificationRequestorsInformation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					verificationRequestorsInformation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in verificationRequestorsInformation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom VerificationRequestorsInformation implementation " +
					verificationRequestorsInformation.getClass());
		}

		VerificationRequestorsInformationModelImpl
			verificationRequestorsInformationModelImpl =
				(VerificationRequestorsInformationModelImpl)
					verificationRequestorsInformation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(verificationRequestorsInformation.getCreateDate() == null)) {

			if (serviceContext == null) {
				verificationRequestorsInformation.setCreateDate(date);
			}
			else {
				verificationRequestorsInformation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!verificationRequestorsInformationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				verificationRequestorsInformation.setModifiedDate(date);
			}
			else {
				verificationRequestorsInformation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(verificationRequestorsInformation);
			}
			else {
				verificationRequestorsInformation =
					(VerificationRequestorsInformation)session.merge(
						verificationRequestorsInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			VerificationRequestorsInformationImpl.class,
			verificationRequestorsInformationModelImpl, false, true);

		cacheUniqueFindersCache(verificationRequestorsInformationModelImpl);

		if (isNew) {
			verificationRequestorsInformation.setNew(false);
		}

		verificationRequestorsInformation.resetOriginalValues();

		return verificationRequestorsInformation;
	}

	/**
	 * Returns the verification requestors information with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the verification requestors information
	 * @return the verification requestors information
	 * @throws NoSuchVerificationRequestorsInformationException if a verification requestors information with the primary key could not be found
	 */
	@Override
	public VerificationRequestorsInformation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchVerificationRequestorsInformationException {

		VerificationRequestorsInformation verificationRequestorsInformation =
			fetchByPrimaryKey(primaryKey);

		if (verificationRequestorsInformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVerificationRequestorsInformationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return verificationRequestorsInformation;
	}

	/**
	 * Returns the verification requestors information with the primary key or throws a <code>NoSuchVerificationRequestorsInformationException</code> if it could not be found.
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information
	 * @throws NoSuchVerificationRequestorsInformationException if a verification requestors information with the primary key could not be found
	 */
	@Override
	public VerificationRequestorsInformation findByPrimaryKey(
			VerificationRequestorsInformationPK
				verificationRequestorsInformationPK)
		throws NoSuchVerificationRequestorsInformationException {

		return findByPrimaryKey(
			(Serializable)verificationRequestorsInformationPK);
	}

	/**
	 * Returns the verification requestors information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information, or <code>null</code> if a verification requestors information with the primary key could not be found
	 */
	@Override
	public VerificationRequestorsInformation fetchByPrimaryKey(
		VerificationRequestorsInformationPK
			verificationRequestorsInformationPK) {

		return fetchByPrimaryKey(
			(Serializable)verificationRequestorsInformationPK);
	}

	/**
	 * Returns all the verification requestors informations.
	 *
	 * @return the verification requestors informations
	 */
	@Override
	public List<VerificationRequestorsInformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the verification requestors informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors informations
	 * @param end the upper bound of the range of verification requestors informations (not inclusive)
	 * @return the range of verification requestors informations
	 */
	@Override
	public List<VerificationRequestorsInformation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the verification requestors informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors informations
	 * @param end the upper bound of the range of verification requestors informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of verification requestors informations
	 */
	@Override
	public List<VerificationRequestorsInformation> findAll(
		int start, int end,
		OrderByComparator<VerificationRequestorsInformation>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the verification requestors informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors informations
	 * @param end the upper bound of the range of verification requestors informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of verification requestors informations
	 */
	@Override
	public List<VerificationRequestorsInformation> findAll(
		int start, int end,
		OrderByComparator<VerificationRequestorsInformation> orderByComparator,
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

		List<VerificationRequestorsInformation> list = null;

		if (useFinderCache) {
			list =
				(List<VerificationRequestorsInformation>)finderCache.getResult(
					finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_VERIFICATIONREQUESTORSINFORMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_VERIFICATIONREQUESTORSINFORMATION;

				sql = sql.concat(
					VerificationRequestorsInformationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<VerificationRequestorsInformation>)QueryUtil.list(
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
	 * Removes all the verification requestors informations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VerificationRequestorsInformation
				verificationRequestorsInformation : findAll()) {

			remove(verificationRequestorsInformation);
		}
	}

	/**
	 * Returns the number of verification requestors informations.
	 *
	 * @return the number of verification requestors informations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_VERIFICATIONREQUESTORSINFORMATION);

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
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "verificationRequestorsInformationPK";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_VERIFICATIONREQUESTORSINFORMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VerificationRequestorsInformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the verification requestors information persistence.
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

		_setVerificationRequestorsInformationUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setVerificationRequestorsInformationUtilPersistence(null);

		entityCache.removeCache(
			VerificationRequestorsInformationImpl.class.getName());
	}

	private void _setVerificationRequestorsInformationUtilPersistence(
		VerificationRequestorsInformationPersistence
			verificationRequestorsInformationPersistence) {

		try {
			Field field =
				VerificationRequestorsInformationUtil.class.getDeclaredField(
					"_persistence");

			field.setAccessible(true);

			field.set(null, verificationRequestorsInformationPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
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

	private static final String _SQL_SELECT_VERIFICATIONREQUESTORSINFORMATION =
		"SELECT verificationRequestorsInformation FROM VerificationRequestorsInformation verificationRequestorsInformation";

	private static final String
		_SQL_SELECT_VERIFICATIONREQUESTORSINFORMATION_WHERE =
			"SELECT verificationRequestorsInformation FROM VerificationRequestorsInformation verificationRequestorsInformation WHERE ";

	private static final String _SQL_COUNT_VERIFICATIONREQUESTORSINFORMATION =
		"SELECT COUNT(verificationRequestorsInformation) FROM VerificationRequestorsInformation verificationRequestorsInformation";

	private static final String
		_SQL_COUNT_VERIFICATIONREQUESTORSINFORMATION_WHERE =
			"SELECT COUNT(verificationRequestorsInformation) FROM VerificationRequestorsInformation verificationRequestorsInformation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"verificationRequestorsInformation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No VerificationRequestorsInformation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No VerificationRequestorsInformation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		VerificationRequestorsInformationPersistenceImpl.class);

	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(
		new String[] {"requestorInformationId", "osiInsolvencyId"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private VerificationRequestorsInformationModelArgumentsResolver
		_verificationRequestorsInformationModelArgumentsResolver;

}