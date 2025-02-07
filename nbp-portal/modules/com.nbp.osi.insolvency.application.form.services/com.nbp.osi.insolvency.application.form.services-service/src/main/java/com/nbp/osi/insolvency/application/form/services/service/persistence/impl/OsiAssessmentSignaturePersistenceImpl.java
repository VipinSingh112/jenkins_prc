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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiAssessmentSignatureException;
import com.nbp.osi.insolvency.application.form.services.model.OsiAssessmentSignature;
import com.nbp.osi.insolvency.application.form.services.model.OsiAssessmentSignatureTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssessmentSignatureImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssessmentSignatureModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiAssessmentSignaturePersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiAssessmentSignatureUtil;
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
 * The persistence implementation for the osi assessment signature service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiAssessmentSignaturePersistence.class)
public class OsiAssessmentSignaturePersistenceImpl
	extends BasePersistenceImpl<OsiAssessmentSignature>
	implements OsiAssessmentSignaturePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiAssessmentSignatureUtil</code> to access the osi assessment signature persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiAssessmentSignatureImpl.class.getName();

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
	 * Returns the osi assessment signature where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiAssessmentSignatureException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assessment signature
	 * @throws NoSuchOsiAssessmentSignatureException if a matching osi assessment signature could not be found
	 */
	@Override
	public OsiAssessmentSignature findBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiAssessmentSignatureException {

		OsiAssessmentSignature osiAssessmentSignature = fetchBygetOsiById(
			osiInsolvencyId);

		if (osiAssessmentSignature == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiAssessmentSignatureException(sb.toString());
		}

		return osiAssessmentSignature;
	}

	/**
	 * Returns the osi assessment signature where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assessment signature, or <code>null</code> if a matching osi assessment signature could not be found
	 */
	@Override
	public OsiAssessmentSignature fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi assessment signature where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi assessment signature, or <code>null</code> if a matching osi assessment signature could not be found
	 */
	@Override
	public OsiAssessmentSignature fetchBygetOsiById(
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

		if (result instanceof OsiAssessmentSignature) {
			OsiAssessmentSignature osiAssessmentSignature =
				(OsiAssessmentSignature)result;

			if (osiInsolvencyId !=
					osiAssessmentSignature.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIASSESSMENTSIGNATURE_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiAssessmentSignature> list = query.list();

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
								"OsiAssessmentSignaturePersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiAssessmentSignature osiAssessmentSignature = list.get(0);

					result = osiAssessmentSignature;

					cacheResult(osiAssessmentSignature);
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
			return (OsiAssessmentSignature)result;
		}
	}

	/**
	 * Removes the osi assessment signature where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi assessment signature that was removed
	 */
	@Override
	public OsiAssessmentSignature removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiAssessmentSignatureException {

		OsiAssessmentSignature osiAssessmentSignature = findBygetOsiById(
			osiInsolvencyId);

		return remove(osiAssessmentSignature);
	}

	/**
	 * Returns the number of osi assessment signatures where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi assessment signatures
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIASSESSMENTSIGNATURE_WHERE);

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
		"osiAssessmentSignature.osiInsolvencyId = ?";

	public OsiAssessmentSignaturePersistenceImpl() {
		setModelClass(OsiAssessmentSignature.class);

		setModelImplClass(OsiAssessmentSignatureImpl.class);
		setModelPKClass(long.class);

		setTable(OsiAssessmentSignatureTable.INSTANCE);
	}

	/**
	 * Caches the osi assessment signature in the entity cache if it is enabled.
	 *
	 * @param osiAssessmentSignature the osi assessment signature
	 */
	@Override
	public void cacheResult(OsiAssessmentSignature osiAssessmentSignature) {
		entityCache.putResult(
			OsiAssessmentSignatureImpl.class,
			osiAssessmentSignature.getPrimaryKey(), osiAssessmentSignature);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {osiAssessmentSignature.getOsiInsolvencyId()},
			osiAssessmentSignature);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi assessment signatures in the entity cache if it is enabled.
	 *
	 * @param osiAssessmentSignatures the osi assessment signatures
	 */
	@Override
	public void cacheResult(
		List<OsiAssessmentSignature> osiAssessmentSignatures) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiAssessmentSignatures.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiAssessmentSignature osiAssessmentSignature :
				osiAssessmentSignatures) {

			if (entityCache.getResult(
					OsiAssessmentSignatureImpl.class,
					osiAssessmentSignature.getPrimaryKey()) == null) {

				cacheResult(osiAssessmentSignature);
			}
		}
	}

	/**
	 * Clears the cache for all osi assessment signatures.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiAssessmentSignatureImpl.class);

		finderCache.clearCache(OsiAssessmentSignatureImpl.class);
	}

	/**
	 * Clears the cache for the osi assessment signature.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiAssessmentSignature osiAssessmentSignature) {
		entityCache.removeResult(
			OsiAssessmentSignatureImpl.class, osiAssessmentSignature);
	}

	@Override
	public void clearCache(
		List<OsiAssessmentSignature> osiAssessmentSignatures) {

		for (OsiAssessmentSignature osiAssessmentSignature :
				osiAssessmentSignatures) {

			entityCache.removeResult(
				OsiAssessmentSignatureImpl.class, osiAssessmentSignature);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiAssessmentSignatureImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiAssessmentSignatureImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiAssessmentSignatureModelImpl osiAssessmentSignatureModelImpl) {

		Object[] args = new Object[] {
			osiAssessmentSignatureModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args,
			osiAssessmentSignatureModelImpl);
	}

	/**
	 * Creates a new osi assessment signature with the primary key. Does not add the osi assessment signature to the database.
	 *
	 * @param osiAssessmentSignatureId the primary key for the new osi assessment signature
	 * @return the new osi assessment signature
	 */
	@Override
	public OsiAssessmentSignature create(long osiAssessmentSignatureId) {
		OsiAssessmentSignature osiAssessmentSignature =
			new OsiAssessmentSignatureImpl();

		osiAssessmentSignature.setNew(true);
		osiAssessmentSignature.setPrimaryKey(osiAssessmentSignatureId);

		osiAssessmentSignature.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiAssessmentSignature;
	}

	/**
	 * Removes the osi assessment signature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature that was removed
	 * @throws NoSuchOsiAssessmentSignatureException if a osi assessment signature with the primary key could not be found
	 */
	@Override
	public OsiAssessmentSignature remove(long osiAssessmentSignatureId)
		throws NoSuchOsiAssessmentSignatureException {

		return remove((Serializable)osiAssessmentSignatureId);
	}

	/**
	 * Removes the osi assessment signature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi assessment signature
	 * @return the osi assessment signature that was removed
	 * @throws NoSuchOsiAssessmentSignatureException if a osi assessment signature with the primary key could not be found
	 */
	@Override
	public OsiAssessmentSignature remove(Serializable primaryKey)
		throws NoSuchOsiAssessmentSignatureException {

		Session session = null;

		try {
			session = openSession();

			OsiAssessmentSignature osiAssessmentSignature =
				(OsiAssessmentSignature)session.get(
					OsiAssessmentSignatureImpl.class, primaryKey);

			if (osiAssessmentSignature == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiAssessmentSignatureException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiAssessmentSignature);
		}
		catch (NoSuchOsiAssessmentSignatureException noSuchEntityException) {
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
	protected OsiAssessmentSignature removeImpl(
		OsiAssessmentSignature osiAssessmentSignature) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiAssessmentSignature)) {
				osiAssessmentSignature = (OsiAssessmentSignature)session.get(
					OsiAssessmentSignatureImpl.class,
					osiAssessmentSignature.getPrimaryKeyObj());
			}

			if (osiAssessmentSignature != null) {
				session.delete(osiAssessmentSignature);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiAssessmentSignature != null) {
			clearCache(osiAssessmentSignature);
		}

		return osiAssessmentSignature;
	}

	@Override
	public OsiAssessmentSignature updateImpl(
		OsiAssessmentSignature osiAssessmentSignature) {

		boolean isNew = osiAssessmentSignature.isNew();

		if (!(osiAssessmentSignature instanceof
				OsiAssessmentSignatureModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiAssessmentSignature.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiAssessmentSignature);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiAssessmentSignature proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiAssessmentSignature implementation " +
					osiAssessmentSignature.getClass());
		}

		OsiAssessmentSignatureModelImpl osiAssessmentSignatureModelImpl =
			(OsiAssessmentSignatureModelImpl)osiAssessmentSignature;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiAssessmentSignature.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiAssessmentSignature.setCreateDate(date);
			}
			else {
				osiAssessmentSignature.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiAssessmentSignatureModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiAssessmentSignature.setModifiedDate(date);
			}
			else {
				osiAssessmentSignature.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiAssessmentSignature);
			}
			else {
				osiAssessmentSignature = (OsiAssessmentSignature)session.merge(
					osiAssessmentSignature);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiAssessmentSignatureImpl.class, osiAssessmentSignatureModelImpl,
			false, true);

		cacheUniqueFindersCache(osiAssessmentSignatureModelImpl);

		if (isNew) {
			osiAssessmentSignature.setNew(false);
		}

		osiAssessmentSignature.resetOriginalValues();

		return osiAssessmentSignature;
	}

	/**
	 * Returns the osi assessment signature with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi assessment signature
	 * @return the osi assessment signature
	 * @throws NoSuchOsiAssessmentSignatureException if a osi assessment signature with the primary key could not be found
	 */
	@Override
	public OsiAssessmentSignature findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiAssessmentSignatureException {

		OsiAssessmentSignature osiAssessmentSignature = fetchByPrimaryKey(
			primaryKey);

		if (osiAssessmentSignature == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiAssessmentSignatureException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiAssessmentSignature;
	}

	/**
	 * Returns the osi assessment signature with the primary key or throws a <code>NoSuchOsiAssessmentSignatureException</code> if it could not be found.
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature
	 * @throws NoSuchOsiAssessmentSignatureException if a osi assessment signature with the primary key could not be found
	 */
	@Override
	public OsiAssessmentSignature findByPrimaryKey(
			long osiAssessmentSignatureId)
		throws NoSuchOsiAssessmentSignatureException {

		return findByPrimaryKey((Serializable)osiAssessmentSignatureId);
	}

	/**
	 * Returns the osi assessment signature with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature, or <code>null</code> if a osi assessment signature with the primary key could not be found
	 */
	@Override
	public OsiAssessmentSignature fetchByPrimaryKey(
		long osiAssessmentSignatureId) {

		return fetchByPrimaryKey((Serializable)osiAssessmentSignatureId);
	}

	/**
	 * Returns all the osi assessment signatures.
	 *
	 * @return the osi assessment signatures
	 */
	@Override
	public List<OsiAssessmentSignature> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi assessment signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssessmentSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assessment signatures
	 * @param end the upper bound of the range of osi assessment signatures (not inclusive)
	 * @return the range of osi assessment signatures
	 */
	@Override
	public List<OsiAssessmentSignature> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi assessment signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssessmentSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assessment signatures
	 * @param end the upper bound of the range of osi assessment signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi assessment signatures
	 */
	@Override
	public List<OsiAssessmentSignature> findAll(
		int start, int end,
		OrderByComparator<OsiAssessmentSignature> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi assessment signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssessmentSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assessment signatures
	 * @param end the upper bound of the range of osi assessment signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi assessment signatures
	 */
	@Override
	public List<OsiAssessmentSignature> findAll(
		int start, int end,
		OrderByComparator<OsiAssessmentSignature> orderByComparator,
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

		List<OsiAssessmentSignature> list = null;

		if (useFinderCache) {
			list = (List<OsiAssessmentSignature>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIASSESSMENTSIGNATURE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIASSESSMENTSIGNATURE;

				sql = sql.concat(OsiAssessmentSignatureModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiAssessmentSignature>)QueryUtil.list(
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
	 * Removes all the osi assessment signatures from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiAssessmentSignature osiAssessmentSignature : findAll()) {
			remove(osiAssessmentSignature);
		}
	}

	/**
	 * Returns the number of osi assessment signatures.
	 *
	 * @return the number of osi assessment signatures
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
					_SQL_COUNT_OSIASSESSMENTSIGNATURE);

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
		return "osiAssessmentSignatureId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIASSESSMENTSIGNATURE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiAssessmentSignatureModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi assessment signature persistence.
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

		OsiAssessmentSignatureUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiAssessmentSignatureUtil.setPersistence(null);

		entityCache.removeCache(OsiAssessmentSignatureImpl.class.getName());
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

	private static final String _SQL_SELECT_OSIASSESSMENTSIGNATURE =
		"SELECT osiAssessmentSignature FROM OsiAssessmentSignature osiAssessmentSignature";

	private static final String _SQL_SELECT_OSIASSESSMENTSIGNATURE_WHERE =
		"SELECT osiAssessmentSignature FROM OsiAssessmentSignature osiAssessmentSignature WHERE ";

	private static final String _SQL_COUNT_OSIASSESSMENTSIGNATURE =
		"SELECT COUNT(osiAssessmentSignature) FROM OsiAssessmentSignature osiAssessmentSignature";

	private static final String _SQL_COUNT_OSIASSESSMENTSIGNATURE_WHERE =
		"SELECT COUNT(osiAssessmentSignature) FROM OsiAssessmentSignature osiAssessmentSignature WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiAssessmentSignature.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiAssessmentSignature exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiAssessmentSignature exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiAssessmentSignaturePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}