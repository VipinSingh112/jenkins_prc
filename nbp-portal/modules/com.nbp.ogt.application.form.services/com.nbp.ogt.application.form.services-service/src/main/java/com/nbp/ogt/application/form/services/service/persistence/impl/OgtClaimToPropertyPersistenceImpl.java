/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence.impl;

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

import com.nbp.ogt.application.form.services.exception.NoSuchOgtClaimToPropertyException;
import com.nbp.ogt.application.form.services.model.OgtClaimToProperty;
import com.nbp.ogt.application.form.services.model.OgtClaimToPropertyTable;
import com.nbp.ogt.application.form.services.model.impl.OgtClaimToPropertyImpl;
import com.nbp.ogt.application.form.services.model.impl.OgtClaimToPropertyModelImpl;
import com.nbp.ogt.application.form.services.service.persistence.OgtClaimToPropertyPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtClaimToPropertyUtil;
import com.nbp.ogt.application.form.services.service.persistence.impl.constants.OGT_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the ogt claim to property service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OgtClaimToPropertyPersistence.class)
public class OgtClaimToPropertyPersistenceImpl
	extends BasePersistenceImpl<OgtClaimToProperty>
	implements OgtClaimToPropertyPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OgtClaimToPropertyUtil</code> to access the ogt claim to property persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OgtClaimToPropertyImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOgtById;
	private FinderPath _finderPathCountBygetOgtById;

	/**
	 * Returns the ogt claim to property where ogtApplicationId = &#63; or throws a <code>NoSuchOgtClaimToPropertyException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claim to property
	 * @throws NoSuchOgtClaimToPropertyException if a matching ogt claim to property could not be found
	 */
	@Override
	public OgtClaimToProperty findBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtClaimToPropertyException {

		OgtClaimToProperty ogtClaimToProperty = fetchBygetOgtById(
			ogtApplicationId);

		if (ogtClaimToProperty == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ogtApplicationId=");
			sb.append(ogtApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtClaimToPropertyException(sb.toString());
		}

		return ogtClaimToProperty;
	}

	/**
	 * Returns the ogt claim to property where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claim to property, or <code>null</code> if a matching ogt claim to property could not be found
	 */
	@Override
	public OgtClaimToProperty fetchBygetOgtById(long ogtApplicationId) {
		return fetchBygetOgtById(ogtApplicationId, true);
	}

	/**
	 * Returns the ogt claim to property where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt claim to property, or <code>null</code> if a matching ogt claim to property could not be found
	 */
	@Override
	public OgtClaimToProperty fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ogtApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgtById, finderArgs, this);
		}

		if (result instanceof OgtClaimToProperty) {
			OgtClaimToProperty ogtClaimToProperty = (OgtClaimToProperty)result;

			if (ogtApplicationId != ogtClaimToProperty.getOgtApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OGTCLAIMTOPROPERTY_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

				List<OgtClaimToProperty> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgtById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ogtApplicationId};
							}

							_log.warn(
								"OgtClaimToPropertyPersistenceImpl.fetchBygetOgtById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtClaimToProperty ogtClaimToProperty = list.get(0);

					result = ogtClaimToProperty;

					cacheResult(ogtClaimToProperty);
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
			return (OgtClaimToProperty)result;
		}
	}

	/**
	 * Removes the ogt claim to property where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt claim to property that was removed
	 */
	@Override
	public OgtClaimToProperty removeBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtClaimToPropertyException {

		OgtClaimToProperty ogtClaimToProperty = findBygetOgtById(
			ogtApplicationId);

		return remove(ogtClaimToProperty);
	}

	/**
	 * Returns the number of ogt claim to properties where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt claim to properties
	 */
	@Override
	public int countBygetOgtById(long ogtApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOgtById;

		Object[] finderArgs = new Object[] {ogtApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTCLAIMTOPROPERTY_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

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

	private static final String _FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2 =
		"ogtClaimToProperty.ogtApplicationId = ?";

	public OgtClaimToPropertyPersistenceImpl() {
		setModelClass(OgtClaimToProperty.class);

		setModelImplClass(OgtClaimToPropertyImpl.class);
		setModelPKClass(long.class);

		setTable(OgtClaimToPropertyTable.INSTANCE);
	}

	/**
	 * Caches the ogt claim to property in the entity cache if it is enabled.
	 *
	 * @param ogtClaimToProperty the ogt claim to property
	 */
	@Override
	public void cacheResult(OgtClaimToProperty ogtClaimToProperty) {
		entityCache.putResult(
			OgtClaimToPropertyImpl.class, ogtClaimToProperty.getPrimaryKey(),
			ogtClaimToProperty);

		finderCache.putResult(
			_finderPathFetchBygetOgtById,
			new Object[] {ogtClaimToProperty.getOgtApplicationId()},
			ogtClaimToProperty);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ogt claim to properties in the entity cache if it is enabled.
	 *
	 * @param ogtClaimToProperties the ogt claim to properties
	 */
	@Override
	public void cacheResult(List<OgtClaimToProperty> ogtClaimToProperties) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ogtClaimToProperties.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OgtClaimToProperty ogtClaimToProperty : ogtClaimToProperties) {
			if (entityCache.getResult(
					OgtClaimToPropertyImpl.class,
					ogtClaimToProperty.getPrimaryKey()) == null) {

				cacheResult(ogtClaimToProperty);
			}
		}
	}

	/**
	 * Clears the cache for all ogt claim to properties.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OgtClaimToPropertyImpl.class);

		finderCache.clearCache(OgtClaimToPropertyImpl.class);
	}

	/**
	 * Clears the cache for the ogt claim to property.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OgtClaimToProperty ogtClaimToProperty) {
		entityCache.removeResult(
			OgtClaimToPropertyImpl.class, ogtClaimToProperty);
	}

	@Override
	public void clearCache(List<OgtClaimToProperty> ogtClaimToProperties) {
		for (OgtClaimToProperty ogtClaimToProperty : ogtClaimToProperties) {
			entityCache.removeResult(
				OgtClaimToPropertyImpl.class, ogtClaimToProperty);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OgtClaimToPropertyImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OgtClaimToPropertyImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OgtClaimToPropertyModelImpl ogtClaimToPropertyModelImpl) {

		Object[] args = new Object[] {
			ogtClaimToPropertyModelImpl.getOgtApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOgtById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgtById, args, ogtClaimToPropertyModelImpl);
	}

	/**
	 * Creates a new ogt claim to property with the primary key. Does not add the ogt claim to property to the database.
	 *
	 * @param ogtClaimToPropertyId the primary key for the new ogt claim to property
	 * @return the new ogt claim to property
	 */
	@Override
	public OgtClaimToProperty create(long ogtClaimToPropertyId) {
		OgtClaimToProperty ogtClaimToProperty = new OgtClaimToPropertyImpl();

		ogtClaimToProperty.setNew(true);
		ogtClaimToProperty.setPrimaryKey(ogtClaimToPropertyId);

		ogtClaimToProperty.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ogtClaimToProperty;
	}

	/**
	 * Removes the ogt claim to property with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtClaimToPropertyId the primary key of the ogt claim to property
	 * @return the ogt claim to property that was removed
	 * @throws NoSuchOgtClaimToPropertyException if a ogt claim to property with the primary key could not be found
	 */
	@Override
	public OgtClaimToProperty remove(long ogtClaimToPropertyId)
		throws NoSuchOgtClaimToPropertyException {

		return remove((Serializable)ogtClaimToPropertyId);
	}

	/**
	 * Removes the ogt claim to property with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ogt claim to property
	 * @return the ogt claim to property that was removed
	 * @throws NoSuchOgtClaimToPropertyException if a ogt claim to property with the primary key could not be found
	 */
	@Override
	public OgtClaimToProperty remove(Serializable primaryKey)
		throws NoSuchOgtClaimToPropertyException {

		Session session = null;

		try {
			session = openSession();

			OgtClaimToProperty ogtClaimToProperty =
				(OgtClaimToProperty)session.get(
					OgtClaimToPropertyImpl.class, primaryKey);

			if (ogtClaimToProperty == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOgtClaimToPropertyException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ogtClaimToProperty);
		}
		catch (NoSuchOgtClaimToPropertyException noSuchEntityException) {
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
	protected OgtClaimToProperty removeImpl(
		OgtClaimToProperty ogtClaimToProperty) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ogtClaimToProperty)) {
				ogtClaimToProperty = (OgtClaimToProperty)session.get(
					OgtClaimToPropertyImpl.class,
					ogtClaimToProperty.getPrimaryKeyObj());
			}

			if (ogtClaimToProperty != null) {
				session.delete(ogtClaimToProperty);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ogtClaimToProperty != null) {
			clearCache(ogtClaimToProperty);
		}

		return ogtClaimToProperty;
	}

	@Override
	public OgtClaimToProperty updateImpl(
		OgtClaimToProperty ogtClaimToProperty) {

		boolean isNew = ogtClaimToProperty.isNew();

		if (!(ogtClaimToProperty instanceof OgtClaimToPropertyModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ogtClaimToProperty.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ogtClaimToProperty);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ogtClaimToProperty proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OgtClaimToProperty implementation " +
					ogtClaimToProperty.getClass());
		}

		OgtClaimToPropertyModelImpl ogtClaimToPropertyModelImpl =
			(OgtClaimToPropertyModelImpl)ogtClaimToProperty;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ogtClaimToProperty.getCreateDate() == null)) {
			if (serviceContext == null) {
				ogtClaimToProperty.setCreateDate(date);
			}
			else {
				ogtClaimToProperty.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ogtClaimToPropertyModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ogtClaimToProperty.setModifiedDate(date);
			}
			else {
				ogtClaimToProperty.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ogtClaimToProperty);
			}
			else {
				ogtClaimToProperty = (OgtClaimToProperty)session.merge(
					ogtClaimToProperty);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OgtClaimToPropertyImpl.class, ogtClaimToPropertyModelImpl, false,
			true);

		cacheUniqueFindersCache(ogtClaimToPropertyModelImpl);

		if (isNew) {
			ogtClaimToProperty.setNew(false);
		}

		ogtClaimToProperty.resetOriginalValues();

		return ogtClaimToProperty;
	}

	/**
	 * Returns the ogt claim to property with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ogt claim to property
	 * @return the ogt claim to property
	 * @throws NoSuchOgtClaimToPropertyException if a ogt claim to property with the primary key could not be found
	 */
	@Override
	public OgtClaimToProperty findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOgtClaimToPropertyException {

		OgtClaimToProperty ogtClaimToProperty = fetchByPrimaryKey(primaryKey);

		if (ogtClaimToProperty == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOgtClaimToPropertyException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ogtClaimToProperty;
	}

	/**
	 * Returns the ogt claim to property with the primary key or throws a <code>NoSuchOgtClaimToPropertyException</code> if it could not be found.
	 *
	 * @param ogtClaimToPropertyId the primary key of the ogt claim to property
	 * @return the ogt claim to property
	 * @throws NoSuchOgtClaimToPropertyException if a ogt claim to property with the primary key could not be found
	 */
	@Override
	public OgtClaimToProperty findByPrimaryKey(long ogtClaimToPropertyId)
		throws NoSuchOgtClaimToPropertyException {

		return findByPrimaryKey((Serializable)ogtClaimToPropertyId);
	}

	/**
	 * Returns the ogt claim to property with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtClaimToPropertyId the primary key of the ogt claim to property
	 * @return the ogt claim to property, or <code>null</code> if a ogt claim to property with the primary key could not be found
	 */
	@Override
	public OgtClaimToProperty fetchByPrimaryKey(long ogtClaimToPropertyId) {
		return fetchByPrimaryKey((Serializable)ogtClaimToPropertyId);
	}

	/**
	 * Returns all the ogt claim to properties.
	 *
	 * @return the ogt claim to properties
	 */
	@Override
	public List<OgtClaimToProperty> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt claim to properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to properties
	 * @param end the upper bound of the range of ogt claim to properties (not inclusive)
	 * @return the range of ogt claim to properties
	 */
	@Override
	public List<OgtClaimToProperty> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt claim to properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to properties
	 * @param end the upper bound of the range of ogt claim to properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt claim to properties
	 */
	@Override
	public List<OgtClaimToProperty> findAll(
		int start, int end,
		OrderByComparator<OgtClaimToProperty> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt claim to properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to properties
	 * @param end the upper bound of the range of ogt claim to properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt claim to properties
	 */
	@Override
	public List<OgtClaimToProperty> findAll(
		int start, int end,
		OrderByComparator<OgtClaimToProperty> orderByComparator,
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

		List<OgtClaimToProperty> list = null;

		if (useFinderCache) {
			list = (List<OgtClaimToProperty>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OGTCLAIMTOPROPERTY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OGTCLAIMTOPROPERTY;

				sql = sql.concat(OgtClaimToPropertyModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OgtClaimToProperty>)QueryUtil.list(
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
	 * Removes all the ogt claim to properties from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OgtClaimToProperty ogtClaimToProperty : findAll()) {
			remove(ogtClaimToProperty);
		}
	}

	/**
	 * Returns the number of ogt claim to properties.
	 *
	 * @return the number of ogt claim to properties
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
					_SQL_COUNT_OGTCLAIMTOPROPERTY);

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
		return "ogtClaimToPropertyId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OGTCLAIMTOPROPERTY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OgtClaimToPropertyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ogt claim to property persistence.
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

		_finderPathFetchBygetOgtById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgtById",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, true);

		_finderPathCountBygetOgtById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOgtById",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, false);

		OgtClaimToPropertyUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OgtClaimToPropertyUtil.setPersistence(null);

		entityCache.removeCache(OgtClaimToPropertyImpl.class.getName());
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OGTCLAIMTOPROPERTY =
		"SELECT ogtClaimToProperty FROM OgtClaimToProperty ogtClaimToProperty";

	private static final String _SQL_SELECT_OGTCLAIMTOPROPERTY_WHERE =
		"SELECT ogtClaimToProperty FROM OgtClaimToProperty ogtClaimToProperty WHERE ";

	private static final String _SQL_COUNT_OGTCLAIMTOPROPERTY =
		"SELECT COUNT(ogtClaimToProperty) FROM OgtClaimToProperty ogtClaimToProperty";

	private static final String _SQL_COUNT_OGTCLAIMTOPROPERTY_WHERE =
		"SELECT COUNT(ogtClaimToProperty) FROM OgtClaimToProperty ogtClaimToProperty WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ogtClaimToProperty.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OgtClaimToProperty exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OgtClaimToProperty exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OgtClaimToPropertyPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}